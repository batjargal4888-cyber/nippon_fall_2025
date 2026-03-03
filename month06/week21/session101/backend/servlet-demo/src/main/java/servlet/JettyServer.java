package servlet;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class JettyServer {
    public static void main(String[] args) throws Exception {
        // Server үүсгэх
        Server server = new Server(8080);

        // ContextHandler үүсгэх
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);

        // Servlet нэмэх
        context.addServlet(new ServletHolder(new HelloServlet()), "/hello");
//        form path deer servlet duudaj ajilluulna uu
        context.addServlet(new ServletHolder(new FormServlet()), "/form");
        
//        Ex2. Энгийн тооцоолуур
        context.addServlet(new ServletHolder(new CalculatorServlet()), "/calculator");
        
        context.addServlet(new ServletHolder(new StudentServlet()), "/api/students/*");

        // Server эхлүүлэх
        server.start();
        System.out.println("Server started at http://localhost:8080/hello");
        server.join();
    }
}