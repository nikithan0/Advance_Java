package com.xworkz.xworkz;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/send")
public class XworkzServlet extends HttpServlet {
	
	public XworkzServlet () {
		System.out.println("This is Xworkz Servlet");
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("Calling doGet method");
	}

}
