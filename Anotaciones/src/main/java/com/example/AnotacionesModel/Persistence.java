package com.example.AnotacionesModel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public interface Persistence  {
	
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Books");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	static EntityManagerFactory createEntityManagerFactory(String string) {
		
		return null;
	}
}
