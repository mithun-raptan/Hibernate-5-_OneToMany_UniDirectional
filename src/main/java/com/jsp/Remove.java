package com.jsp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Remove {
	public static void main(String[] args) {
		EntityManagerFactory emf  =  Persistence.createEntityManagerFactory("dev");
		EntityManager em  = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		Boy b = em.find(Boy.class, 101);
		if (b != null) {
			List<Girl> listofgirls =b.getGirls();
			if(listofgirls!=null && !listofgirls.isEmpty()) {
				for(Girl g : listofgirls) {
					if(g.getId()==3) {
						
						listofgirls.remove(g); // from list delete first ==>  else list will have illegal reference object which is no longer present in the DB.
						
						et.begin();
						em.remove(g);
						et.commit();
						System.out.println("particular girl record got deleted from the database");
					}
					else {
						System.out.println("this particular girl record no longer present in the DB");
					}
				}
			}
			else {
				System.out.println("there is not girl record preset at this moment...");
			}
				
		}
		else {
			System.out.println("boy record not found...");
		}
	}

}
