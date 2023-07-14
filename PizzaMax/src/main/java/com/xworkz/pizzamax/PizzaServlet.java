package com.xworkz.pizzamax;


import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.pizzamax.dto.PizzaDto;
import com.xworkz.pizzamax.service.PizzaService;
import com.xworkz.pizzamax.service.PizzaServiceImpl;

@WebServlet(urlPatterns ="/send")
public class PizzaServlet extends HttpServlet{

	public PizzaServlet() {
		System.out.println("Constructor from PizzaServlet");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		System.out.println("Calling do post method");
		
		PizzaDto dto = new PizzaDto();
		dto.setPizzaName(req.getParameter("pizzaName"));
		dto.setType(req.getParameter("type"));
		dto.setLocation(req.getParameter("location"));
		dto.setPaymentMode(req.getParameter("paymentmode"));
		System.out.println(dto);
		
		PizzaService service = new PizzaServiceImpl();
		boolean saving = service.save(dto);
		System.out.println(saving);
		
		resp.setContentType("Text/Html");
		PrintWriter writer = resp.getWriter();
		writer.println(dto);
	}
}
