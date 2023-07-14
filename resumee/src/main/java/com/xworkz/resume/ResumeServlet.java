package com.xworkz.resume;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/send")
public class ResumeServlet extends HttpServlet {
	
	public ResumeServlet() {
		System.out.println("This is Resume Servlet");
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
	System.out.println("Do method is running");
	
	String firstName = req.getParameter("firstname");
	String lastName = req.getParameter("lastname");
	String email = req.getParameter("email");
	String jobRole = req.getParameter("jobrole");
	String projectName = req.getParameter("project");
	System.out.println(firstName+" "+lastName+" "+email+" "+jobRole+" "+projectName);
	
	resp.setContentType("text/Html");
	PrintWriter writer =resp.getWriter();
	writer.println("<h2><u>Displaying Resume</u></h2>");
	
	//writer.println("<h2>firstName="+" "+firstName);
//	writer.println("lastName="+" "+lastName);
//	writer.println("email="+" "+email );
//	writer.println("jobrole="+" "+jobRole);
//	writer.println("project="+" "+projectName);
//	writer.println("<br>");
	
	
	writer.println("<h5>"+" "+firstName +" "+ "<h5>"+" "+lastName+" " +"<h5>"+" "+email+" "+"<h5>"+" "+jobRole+" "+"<h5>"+" "+projectName);
	
	}
	
	

}
