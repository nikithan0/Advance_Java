package com.xworkz.twitter.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.xworkz.twitter.configuration.TwitterConfig;
import com.xworkz.twitter.dto.TwitterDto;

public class TwitterRepoImpl implements TwitterRepo{

	SessionFactory sessoinFactory = TwitterConfig.getSessionFactory();
	@Override
	public boolean save(TwitterDto dto) {
		Session session = sessoinFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(dto);
		transaction.commit();
		session.close();
		return true;
	}
	@Override
	public TwitterDto findByName(String name) {
		 Session session = sessoinFactory.openSession();
		 String query = "From TwitterDto where name =" + name;
		 Query<TwitterDto> query1 = session.createQuery(query, TwitterDto.class);
		 TwitterDto dto = query1.getSingleResult();
		return dto;
	}
	@Override
	public TwitterDto updateAgeByName(String name, int age) {
		Session session = sessoinFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query<TwitterDto> query = session.createQuery("From TwitterDto where name ="+ name, TwitterDto.class);
		TwitterDto dtos = query.getSingleResult();
		dtos.setAge(age);
		session.update(dtos);
		transaction.commit();
		session.close();	
		return dtos;
	}
	@Override
	public TwitterDto updateByName(String name, String email, int age) {
		Session session = sessoinFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Query<TwitterDto> query = session.createQuery("From TwitterDto where name=" +name, TwitterDto.class);
		TwitterDto dto = query.getSingleResult();
		dto.setEmail(email);
		dto.setAge(age);
		session.update(dto);
		transaction.commit();
		session.close();
		return dto;
	}
	@Override
	public List<TwitterDto> readAll() {
		Session session = sessoinFactory.openSession();
		Query query = session.createQuery("From TwitterDto");
		List<TwitterDto> list = query.list();
		return list;
	}

}
