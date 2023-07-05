package com.xworkz.boring;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/send")
public class BoringServlet extends HttpServlet{
	
	public BoringServlet() {
		System.out.println("This is BoringServlet");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)  {
		System.out.println("Running the doGet method");
	}

}
