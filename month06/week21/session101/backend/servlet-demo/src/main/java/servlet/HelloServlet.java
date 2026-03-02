package servlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");

//        h2, p, div element ashiglaad uursdiinhuu taniltsuulgiig HTML deer bichne uu.

		resp.getWriter().write(
			"<div style='font-family: Arial; padding: 20px'>" + "<h1>Hello from Servlet!</h1>" + "<h2>Танилцуулга</h2>"
				+ "<p>Намайг Батжаргал гэдэг. Би веб хөгжүүлэлтэд сонирхолтой, Java болон Spring Framework дээр ажиллах дуртай.</p>"
				+ "<p>Одоогоор Servlet болон JSP ашиглан вэб аппликэйшн хөгжүүлж байна.</p>" + "<div>"
				+ "<h2>Сонирхол</h2>" + "<p>- Программчлал<br>" + "- Веб технологи<br>" + "- Хиймэл оюун ухаан</p>"
				+ "</div>" + "</div>");
	}
}