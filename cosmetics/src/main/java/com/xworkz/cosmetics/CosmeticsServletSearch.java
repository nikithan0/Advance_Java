package com.xworkz.cosmetics;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.cosmetics.dto.CosmeticsDto;
import com.xworkz.cosmetics.service.CosmeticsService;
import com.xworkz.cosmetics.service.CosmeticsServiceImpl;

@WebServlet(urlPatterns="/search")
public class CosmeticsServletSearch extends HttpServlet{
	
	public CosmeticsServletSearch() {
		System.out.println("This is Cosmetics search servlet");
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		CosmeticsDto dto = new CosmeticsDto();
		dto.setFirstName(req.getParameter("firstName"));
		dto.setLastName(req.getParameter("lastName"));
		dto.setEmail(req.getParameter("email"));
		dto.setAge(req.getParameter("age"));
		dto.setPhoneNumber(req.getParameter("phoneNumber"));
		dto.setLocation(req.getParameter("location"));
		dto.setPincode(req.getParameter("pincode"));
		dto.setProductName(req.getParameter("productName"));
		dto.setQuantity(req.getParameter("quantity"));
		dto.setPayment(req.getParameter("payment"));
		String name = req.getParameter("firstName");
		
		CosmeticsService service = new CosmeticsServiceImpl();
		
		boolean find = service.findByFirstName("Pallavi");
		System.out.println(find);
		
		resp.setContentType("Text/Html");
		PrintWriter writer = resp.getWriter();
		
		
		writer.println("<h1>Welcome                 "+ "<u>"+name+"</u>"+ " choose your Favourites..</h1>");
		writer.println(find);
		
		
	}
	
 
}
