package com.xworkz.laptop.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.xworkz.laptop.configure.LaptopConfigure;
import com.xworkz.laptop.dto.LaptopDto;

public class LaptopRepoImpl implements LaptopRepo {

	SessionFactory factory = LaptopConfigure.getSessionFatory();

	@Override
	public boolean save(LaptopDto dto) {
		Session session = factory.openSession();

		Transaction transaction = session.getTransaction();

		transaction.begin();
		session.save(dto);
		transaction.commit();
		session.close();

		return false;
	}

	@Override
	public LaptopDto findById(int id) {
		Session session = factory.openSession();
		LaptopDto dto = session.get(LaptopDto.class, id);
		return dto;
	}

	@Override
	public List<LaptopDto> readAll() {
		Session session = factory.openSession();
		Query query = session.createQuery("from LaptopDto");
		List<LaptopDto> list = query.list();
		return list;

	}

	@Override
	public boolean updateByName(String name) {

		return false;
	}

	@Override
	public boolean update(LaptopDto dto) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(dto);
		transaction.commit();
		session.close();
		System.out.println("Dto is updated");
		return true;
	}

	@Override
	public boolean delete(LaptopDto dto) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(dto);
		transaction.commit();
		session.close();
		System.out.println("Dto is deleted");
		return true;
	}

	@Override
	public boolean deleteById(int id) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(id);
		transaction.commit();
		session.close();
		System.out.println("Dto deleted by id");
		return false;
	}

}
