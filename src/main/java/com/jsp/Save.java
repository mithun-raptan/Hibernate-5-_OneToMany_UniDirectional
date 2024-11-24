package com.jsp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {
	public static void main(String[] args) {
		EntityManagerFactory emf  =  Persistence.createEntityManagerFactory("dev");
		EntityManager em  = emf.createEntityManager();
		EntityTransaction et =  em.getTransaction();
		
		Boy b = new Boy();
			b.setId(101);
			b.setName("mithun");
			b.setEmail("m@g.com");
			b.setPassword("1234");
			b.setMob(6291485214l);
			b.setEx("nidhi");
			
		Girl g1 = new Girl();
			 g1.setId(1);
			 g1.setName("sohini");
			 g1.setInstaid("s@123");
			 
		Girl g2 = new Girl();
			 g2.setId(2);
			 g2.setName("sona");
			 g2.setInstaid("s@123");
			 
		Girl g3 = new Girl();
			 g3.setId(3);
			 g3.setName("mona");
			 g3.setInstaid("m@123");
			 
			 List<Girl> l = new ArrayList<>();
			 l.add(g1);
			 l.add(g2);
			 l.add(g3);
			 
			 
			 //mapping
			 b.setGirls(l);
			 
			 //save/persist
			 et.begin();
			 em.persist(b);
			 em.persist(g1);
			 em.persist(g2);
			 em.persist(g3);
			 et.commit();
			 System.out.println("record saved into the database");
			 
		
	}

}
