package servlet;

//==========================
//IMPORTS
//==========================

// File reading and writing
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// Collection utilities
import java.util.ArrayList;
import java.util.List;

// Servlet API
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*
==========================================================
 CalculatorServlet
 ----------------------------------------------------------
 URL: /calculator

 GET  → Displays the calculator form and last 5 results
 POST → Performs calculation, saves result to file,
         and displays updated history
==========================================================
*/
public class CalculatorServlet extends HttpServlet {

    // File where calculation history is stored
	private static final String FILE_PATH = "history.txt";
	
    /*
    ==========================================================
     Handles HTTP GET request
     - Displays input form
     - Displays last 5 calculations
    ==========================================================
   */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
        // ----- HTML Header -----
		out.println("<!DOCTYPE html>");
		out.println("<html><head><title>Calculator</title></head><body>");
		out.println("<h1>Simple Calculator</h1>");
		
        // ----- Calculator Form -----
		out.println("<form method='POST' action='/calculator'>");
		
		out.println("Number 1: <input type='text' name='num1' required><br><br>");
		out.println("Number 2: <input type='text' name='num2' required><br><br>");
		
		out.println("Operation: ");
		out.println("<select name='operation'>");
		out.println("<option value='+'>+</option>");
		out.println("<option value='-'>-</option>");
		out.println("<option value='*'>*</option>");
		out.println("<option value='/'>/</option>");
		out.println("</select><br><br>");
		
		out.println("<button type='submit'>Calculate</button>");
		out.println("</form>");
		
        // ----- Display History -----
		showLastFive(out);
		
		out.println("</body></html>");
	}
	
    /*
    ==========================================================
     Handles HTTP POST request
     - Reads user input
     - Converts input to double
     - Performs selected arithmetic operation
     - Saves result to history file
     - Displays result and history
    ==========================================================
   */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
        // Retrieve form parameters
		String num1Str = req.getParameter("num1");
		String num2Str = req.getParameter("num2");
		String operation = req.getParameter("operation");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html><head><title>Calculator</title></head><body>");
		out.println("<h1>Simple Calculator</h1>");
		
		try {
            // Convert String input to double
			double num1 = Double.parseDouble(num1Str);
			double num2 = Double.parseDouble(num2Str);
			double result = 0;
			
            // Perform selected operation
			if (operation.equals("+")) {
				result = num1 + num2;
			} else if (operation.equals("-")) {
				result = num1 - num2;
			} else if (operation.equals("*")) {
				result = num1 * num2;
			} else if (operation.equals("/")) {
				
                // Prevent division by zero
				if (num2 == 0) {
					throw new ArithmeticException("Cannot divide by zero!");
				}
				
				result = num1 / num2;
			}
			
            // Format calculation for history file
			String historyLine =
					num1Str + " " + operation + " " + num2 + " = " + result;
			
            // Save calculation to file (append mode)
			try (BufferedWriter writer = 
					new BufferedWriter(new FileWriter(FILE_PATH, true))) {
				
				writer.write(historyLine);
				writer.newLine();
			}
			
            // Display result
			out.println("<h2>Result: " + historyLine + "</h2>");
			
		} 
		catch (NumberFormatException e) {
            // Triggered if input is not a valid number
			out.println("<p style='color:red;'>Invalid number format!</p>");
			
		} 
		catch (ArithmeticException e) {
            // Triggered for division by zero
			out.println("<p style='color:red;'>" + e.getMessage() + "</p>");
		}
		
		out.println("<a href='/calculator'>Back</a><hr>");
		
        // Display updated history
		showLastFive(out);
		
		out.println("</body></html>");
	}
	
    /*
    ==========================================================
     Reads history.txt and displays the last 5 calculations
     - Loads entire file into a List
     - Prints last 5 entries in reverse order
    ==========================================================
   */
	private void showLastFive(PrintWriter out) throws IOException {
		
		File file = new File(FILE_PATH);
		
        // If file does not exist, nothing to display
		if (!file.exists()) {
			return;
		}
		
		List<String> lines = new ArrayList<>();
		
        // Read all lines from file
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line;
			
			while ((line = reader.readLine()) != null) {
				lines.add(line);
			}
		}
		
		out.println("<h3>Last 5 Calculations:</h3>");
		
        // Determine starting index for last 5 entries
		int start = Math.max(lines.size() -5, 0);
		
        // Print in reverse order (newest first)
		for (int i = lines.size() - 1; i >= start; i--) {
			out.println("<p>" + lines.get(i) + "</p>");		
		}
	}
}
