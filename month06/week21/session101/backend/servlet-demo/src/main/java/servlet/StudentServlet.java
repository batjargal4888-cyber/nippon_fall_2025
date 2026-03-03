package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class StudentServlet extends HttpServlet {

    private List<Student> students = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        StringBuilder json = new StringBuilder("[");
        
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);

            json.append("{\"name\":\"")
                .append(s.getName())
                .append("\",\"email\":\"")
                .append(s.getEmail())
                .append("\"}");

            if (i < students.size() - 1) {
                json.append(",");
            }
        }

        json.append("]");

        resp.setContentType("application/json");
        resp.getWriter().write(json.toString());
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	StringBuilder body = new StringBuilder();
    	String line;
    	while ((line=req.getReader().readLine()) != null) {
			body.append(line);
		}
    	String text = body.toString();
    	String name = extractValue(text, "name");
    	String email = extractValue(text, "email");
    	students.add(new Student(name, email));
    	resp.setContentType("application/json");
    	resp.getWriter().write("{\"status\":\"added\"}");
    			
    }
    
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String pathInfo = req.getPathInfo();
    	if (pathInfo != null && pathInfo.length() > 1) {
			int id = Integer.parseInt(pathInfo.substring(1));
			if (id >= 0 && id < students.size()) {
				students.remove(id);
			}
		}
    	
    	resp.setContentType("application/json");
    	resp.getWriter().write("{\"status\":\"deleted\"}");
    }
    
    private String extractValue(String text, String key) {
    	int keyStart = text.indexOf("\"" + key + "\"");
    	int valueStart = text.indexOf(":", keyStart) + 2;
    	int valueEnd = text.indexOf("\"", valueStart);
    	return text.substring(valueStart, valueEnd);
    }
}