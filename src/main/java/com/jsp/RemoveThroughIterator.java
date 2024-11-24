package com.jsp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class RemoveThroughIterator {
	public static void main(String[] args) {
		EntityManagerFactory emf  =  Persistence.createEntityManagerFactory("dev");
		EntityManager em  = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Boy b=em.find(Boy.class, 101);
		if(b!=null) {
			List<Girl> listofgirls=b.getGirls();
			if(listofgirls!=null && !listofgirls.isEmpty()) {
				
			}
		}
	}

}
