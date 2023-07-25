package com.xworkz.company;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.xworkz.company.dto.CompanyDto;

public class CompanyRunner {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("company-connection");

		EntityManager em = emf.createEntityManager();

		EntityTransaction transaction = em.getTransaction();

		transaction.begin();

		CompanyDto dto1 = new CompanyDto(1, "Apple Inc.", "Steve Jobs", "iPhone", 164000, "apple.com");
		CompanyDto dto2 = new CompanyDto(2, "Microsoft", "Bill Gate", "Software products", 221000, "microsoft.com");
		CompanyDto dto3 = new CompanyDto(3, "Amazon", "Jeff Bezos", "All products", 1541000, "amazon.com");

//		em.persist(dto1);
//		em.persist(dto2);
//		em.persist(dto3);
		
		System.out.println("------------------------------------find------------------------------------");

		CompanyDto find = em.find(CompanyDto.class, 1);
		System.out.println(find);
		
		System.out.println("------------------------------------merge------------------------------------");
		
		CompanyDto merge = em.merge(dto3);
		System.out.println(merge);
		
		System.out.println("------------------------------------delete------------------------------------");

//		em.remove(em.find(CompanyDto.class,2));
		
		
		
		transaction.commit();
		em.close();
		
		

	}

}
