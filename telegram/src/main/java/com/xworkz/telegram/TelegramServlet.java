package com.xworkz.telegram;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/send")

public class TelegramServlet extends HttpServlet{
	
	public TelegramServlet() {
		System.out.println("This is Telegram servlet");
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp){
		System.out.println("Do get method is running");
	}
	

}
