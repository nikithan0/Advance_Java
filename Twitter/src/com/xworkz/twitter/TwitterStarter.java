package com.xworkz.twitter;

import java.util.List;

import com.xworkz.twitter.dto.TwitterDto;
import com.xworkz.twitter.service.TwitterService;
import com.xworkz.twitter.service.TwitterServiceImpl;

public class TwitterStarter {

	public static void main(String[] args) {
	
	
	TwitterDto dto1 = new TwitterDto(1,"Aleena", "aleena@gmail.com", 7857905467L, 23, "12/7/2001", "Female");
	TwitterDto dto2 = new TwitterDto(2, "Mervin", "mervin@gamil.com", 9087567890L, 24, "3/2/2000", "Male");
	TwitterDto dto3 = new TwitterDto(3, "Anisha", "anisha@gamil.com", 7340987890L, 22, "5/6/2002", "Female");
	TwitterDto dto4 = new TwitterDto(4, "Delia", "delia@gamil.com", 9897567890L, 24, "14/8/2000", "Female");
	TwitterDto dto5 = new TwitterDto(5, "Preetham", "preetham@gamil.com", 7987567432L, 21, "25/8/2003", "Male");
	
	
	TwitterService service = new TwitterServiceImpl();
	
//	service.save(dto1);
//	service.save(dto2);
//	service.save(dto3);
//	service.save(dto4);
//	service.save(dto5);
	
	TwitterDto dto = service.findByName("'Delia'");
	System.out.println(dto);
	
	System.out.println("-----------------------------------------------");
	
	TwitterDto updateAgeByName = service.updateAgeByName("'Delia'", 23);
	System.out.println(updateAgeByName);
	
	System.out.println("-----------------------------------------------");
	
	TwitterDto updateByName = service.updateByName("'Preetham'", "'preethampreeth@gamil.com'", 20);
	System.out.println(updateByName);

	System.out.println("-----------------------------------------------");

	List<TwitterDto> list = service.readAll();
	list.forEach((li)->{System.out.println(li);});
	

}
}