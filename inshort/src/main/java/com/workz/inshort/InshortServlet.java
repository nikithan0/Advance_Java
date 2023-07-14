package com.workz.inshort;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/send")
public class InshortServlet extends HttpServlet {
	public InshortServlet() {
		System.out.println("This is inshot servlet");
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		System.out.println("do get method is running");
		String userName = req.getParameter("name");
		String userEmail = req.getParameter("email");
		System.out.println(userName+" "+ userEmail);
		
		resp.setContentType("text/HTML");
		PrintWriter writer=resp.getWriter();
		writer.println("<h2>Successfully added</h2>");
		
		writer.println("Name"+"  "+userName);
		writer.println("Email"+"  "+userEmail);
	}
	

}
