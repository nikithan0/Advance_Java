package com.xworkz.cars.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.xworkz.cars.dto.CarsDto;

public class CarsRepoImpl implements CarsRepo{
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("cars-connection");
	
	EntityManager em = emf.createEntityManager();

	@Override
	public boolean save(CarsDto dto) {
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		em.persist(dto);
		trans.commit();
		System.out.println("Dto's are saved");
		return true;
	}

	@Override
	public CarsDto findById(int id) {
		CarsDto dto = em.find(CarsDto.class, id);
		System.out.println("Dto is find by id");
		return dto;
	}

	@Override
	public CarsDto findByName(String name) {
		String query = "From CarsDto where name="+name;
		TypedQuery<CarsDto> que = em.createQuery(query, CarsDto.class);
		CarsDto dto = que.getSingleResult();
		System.out.println("Name is found");
		return dto;
	}

	@Override
	public boolean updateById(int id, String name) {
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		
		CarsDto dto = em.find(CarsDto.class, id);
		dto.setName(name);
	    em.merge(dto);
	    trans.commit();
	    System.out.println("Name is updated");
		return true;
	}
	
	@Override
	public boolean updateByNameId(int id, String name, String color) {
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		CarsDto dto = findById(id);
		CarsDto dto1 =findByName(name);
		if(dto.equals(dto1)) {
			dto.setColor(color);
			em.merge(dto);
			trans.commit();
			return true;
		}
		return false;
	}

	
	@Override
	public boolean deleteById(int id) {
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		CarsDto dto = em.find(CarsDto.class, id);
		em.remove(dto);
		trans.commit();
		em.close();
		System.out.println("Dto is deleted");		
		return true;
	}

	@Override
	public List<CarsDto> readAll() {
		EntityTransaction trans = em.getTransaction();
		trans .begin();
		Query query = em.createQuery("From CarsDto");
		List<CarsDto> list = query.getResultList();	
		return list;
	}

	
	

}
