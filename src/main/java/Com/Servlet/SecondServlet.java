package Com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FirstServlet")
public class SecondServlet extends HttpServlet {
	
	//private static final long serialVersionUID = 1L;
    

		//request will capture the data which is coming from client side
		//right now request is blank
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Hello world");
		
		response.setContentType("text/html");
		
		PrintWriter pw=response.getWriter();
		
		//printWriter:-->print the data to a character stream
		//getWriteer()---> return the printWriter object that can send character text to the client
		
		pw.println("Hiii");
		
		pw.println("<h1>How are you?</h1>");
		
		pw.println("<h2> I'm great</h>");
		
		
	//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
