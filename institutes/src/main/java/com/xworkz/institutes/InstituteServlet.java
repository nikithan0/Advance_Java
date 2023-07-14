package com.xworkz.institutes;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/send")
public class InstituteServlet extends HttpServlet {
	
	public InstituteServlet() {
		System.out.println("This is Institute Servlet");
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp){
		System.out.println("Do get method is running");		
	}

}
