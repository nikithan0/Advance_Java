package com.xworkz.tab;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.xworkz.tab.configure.TabConfig;
import com.xworkz.tab.dto.TabDto;

public class RunnerClass {
	public static void main(String[] args) {
		
	SessionFactory factory = TabConfig.getSessionFactory ();	
	
	TabDto dto = new TabDto(1,"OnePlus", "Black", 39999, "13.0 MP", "256 GB", 12);
	TabDto dto1 = new TabDto(2,"Lenevo", "Black", 27899, "13 Mp", "1128 GB",6);
	TabDto dto2 = new TabDto(3,"Samsung Galaxy", "white", 29000, "8Mp","64 GB", 4);
	
	Session session = factory.openSession();
	
	Transaction transaction = session.beginTransaction();
	
//	session.save(dto);
//	session.save(dto1);
//	session.save(dto2);
	
	TabDto returnData = session.get(TabDto.class, 1);
	System.out.println(returnData);
	
	session.update(dto1);
	session.delete(dto2);
	
//    Criteria criteria = session.createCriteria(TabDto.class);
//   List<TabDto> list = criteria.list();
//	
//	Query query = session.createQuery("From TabDto where name = 'Realme'");
    Query query = session.createQuery("From TabDto");
	List<TabDto> list1 = query.list();
	
	for (TabDto dtos : list1) {
		System.out.println(dtos);
	}
	
	
	
	transaction.commit();
	session.close();
	
	
			
	}

}
