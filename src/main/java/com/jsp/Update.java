package com.jsp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update {
		public static void main(String[] args) {
			EntityManagerFactory emf  =  Persistence.createEntityManagerFactory("dev");
			EntityManager em  = emf.createEntityManager();
			EntityTransaction et  =  em.getTransaction();
			Boy b=em.find(Boy.class, 101);
			if(b!=null) {
				List<Girl> listofgirls = b.getGirls();
				if(listofgirls!=null && !listofgirls.isEmpty()) {
					for(Girl g : listofgirls) {
						if(g.getId()==2) {
							g.setInstaid("s@456");
							et.begin();
							em.merge(g);
							et.commit();
							System.out.println("girl record updated");
							
						}
						
					}
				}
				else {
					System.out.println("there is no girl record present in the database for this boy id");
				}
				
			}
			else {
				System.out.println("boy record not found...");
			}
		}
}
