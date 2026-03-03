package servlet;

import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileAlreadyExistsException;
import java.time.LocalDateTime;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet{
	private static final String FILE_PATH = "submission.txt"; 

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html><head><title>Contact Form</title></head>");
		out.println("<body>");
		out.println("<h1>Contact Form</h1>");
		out.println("<form method='POST' action='/form'>");
		out.println(" Name: <input type='text' name='name' required><br><br>");
		out.println(" Email: <input type='email' name='email' required><br><br>");
		out.println(" Message: <br><textarea name='message' rows='5' cols='40' required></textarea><br><br>");
		out.println(" <button type='submit'>Submit</button>");
		out.println("</form>");
		out.println("</body></html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String message = req.getParameter("message");
		
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
			writer.write("+++++++ Submissions: " + LocalDateTime.now() + " +++++++");
			writer.newLine();
			writer.write("Name: " + name);
			writer.newLine();
			writer.write("Email: " + email);
			writer.newLine();
			writer.write("Message: " + message);
			writer.newLine();
			writer.newLine();
		} 
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("!<DOCTYPE html>");
		out.println("<html><head><title>Contact Form</title></head>");
		out.println("<body>");
		out.println("<h1>Saved!</h1>");
		out.println("<p>Name: " + name + "</p>");
		out.println("<p>Email: " + email + "</p>");
		out.println("<p>Message: " + message + "</p>");
		out.println("<p>Data saved to <b>" + FILE_PATH + "</b></p>");
		out.println("<a href='/form'>Submit another</a>");
		out.println("<a href='/form'>Submit another</a>");
		out.println("</bpdy><html>");
	}
}
