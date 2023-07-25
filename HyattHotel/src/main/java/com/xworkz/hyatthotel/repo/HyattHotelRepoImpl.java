package com.xworkz.hyatthotel.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.xworkz.hyatthotel.dto.HyattEmployeDto;


public class HyattHotelRepoImpl implements HyattHotelRepo{
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("hotelemployee-connection");
	
	EntityManager em = emf.createEntityManager();
	

	@Override
	public boolean save(HyattEmployeDto dto) {
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		em.persist(dto);
		transaction.commit();
		
		return true;
	}
	
	@Override
	public boolean updateNameById(int id, String name) {
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		
		HyattEmployeDto dto = em.find(HyattEmployeDto.class, id);
		dto.setName(name);
		em.merge(dto);
		trans.commit();
		System.out.println("Updated");
		return true;	
	}
	
	@Override
	public boolean deleteById(int id) {
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		
		HyattEmployeDto dto = em.find(HyattEmployeDto.class, id);
		System.out.println(dto);
		em.remove(dto);
		trans.commit();
		System.out.println("Deleted");
		return true;
	}

	

	@Override
	public List<HyattEmployeDto> readAll() {
		EntityTransaction tran = em.getTransaction();
		tran.begin();
	    Query query = em.createQuery("From HyattEmployeDto");
	    List<HyattEmployeDto> list = query.getResultList();
		return list;
	}

	@Override
	public HyattEmployeDto findByName(String name) {
		
		String que = "From HyattEmployeDto where name="+ name;
		TypedQuery<HyattEmployeDto> query = em.createQuery(que,HyattEmployeDto.class);
		HyattEmployeDto dto = query.getSingleResult();
		System.out.println("Name Find");
		return dto;
	}

	@Override
	public HyattEmployeDto findById(int id) {
		HyattEmployeDto dto = em.find(HyattEmployeDto.class, id); 
		return dto;
	}

	


	


}
