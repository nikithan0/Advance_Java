package com.xworkz.amazon.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.xworkz.amazon.configuration.AmazonConfig;
import com.xworkz.amazon.dto.AmazonDto;


public class AmazonRepoImpl implements AmazonRepo {

	SessionFactory sessoinFactory = AmazonConfig.getSessionFactory();
	
	@Override
	public boolean save(AmazonDto dto) {
		Session session = sessoinFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(dto);
		transaction.commit();
		session.close();
		return true;
	}

	@Override
	public AmazonDto findById(int id) {
		Session session = sessoinFactory.openSession();
		System.out.println("Id found");
		return session.find(AmazonDto.class, id);	
	}

	@Override
	public AmazonDto findByName(String name) {
		Session session = sessoinFactory.openSession();
		String query = "From AmazonDto where name="+name;
		Query<AmazonDto> que = session.createQuery(query,AmazonDto.class);
		AmazonDto dto = que.getSingleResult();
		System.out.println("Name is found");
		return dto;
	}

	@Override
	public boolean updateById(int id, String name) {
		Session session = sessoinFactory.openSession();
		Transaction transaction = session.beginTransaction();
		AmazonDto dto = session.find(AmazonDto.class, id);
		dto.setName(name);
		session.update(dto);
		transaction.commit();
		session.close();
		return true;
	}

	@Override
	public boolean updateByNameId(int id, String name, String location) {
		Session session = sessoinFactory.openSession();
		Transaction transaction = session.beginTransaction();
		AmazonDto dto = findById(id);
		AmazonDto dto1 = findByName(name);
		if(dto.equals(dto1)) {
			dto.setLocation(location);
			session.update(dto);
			transaction.commit();
			session.close();
			System.out.println("Updated location");
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteById(int id) {
		Session session = sessoinFactory.openSession();
		Transaction transaction = session.beginTransaction();
		AmazonDto dto = findById(id);
		session.delete(dto);
		transaction.commit();
		session.close();
		System.out.println("Deleted by id");
		return true;
	}

	@Override
	public List<AmazonDto> readAll() {
		Session session = sessoinFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Query que = session.createQuery("From AmazonDto");
		List<AmazonDto> list = que.getResultList();
		return list;
	}

}
