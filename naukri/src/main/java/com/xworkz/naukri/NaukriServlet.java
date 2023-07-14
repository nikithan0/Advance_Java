package com.xworkz.naukri;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/send")
public class NaukriServlet extends HttpServlet {
	
	public NaukriServlet() {
		System.out.println("This is the Naukri servlet");
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("Here the do get method is Running");
	}
	

}
