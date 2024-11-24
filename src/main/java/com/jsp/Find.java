package com.jsp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Find {
	public static void main(String[] args) {
		EntityManagerFactory emf  =  Persistence.createEntityManagerFactory("dev");
		EntityManager em  = emf.createEntityManager();
		
		Boy b = em.find(Boy.class, 101);
		if(b!=null) {
			System.out.println(b.getName()+" "+b.getEmail()+" "+b.getMob()+" "+b.getEx());
			List<Girl> listofgirls = b.getGirls();
			if(listofgirls!=null && !listofgirls.isEmpty()) {
				System.out.println("girls record");
				for(Girl g: listofgirls) {
					System.out.println(g.getName()+" "+g.getInstaid());
					
				}
			}
			else {
				System.out.println("Girl records not found");
			}
			
		}
		else {
			System.out.println("boy redord not found");
		}
	}

}
