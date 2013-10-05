package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernating {
	
	String userName;
	public Hibernating(String userName){
		this.userName = userName;
	}
	
	public void doSave(){
		UserDetails user = new UserDetails();
		user.setUserId(1);
		user.setUserName(userName);
		
		// Creating a session factory:
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		// Using session object to save an object. 
		// First, begin a transaction:
		session.beginTransaction();
		
		// Saving:
		session.save(user);
		
		// Ending the transaction:
		session.getTransaction().commit();
	}

}
