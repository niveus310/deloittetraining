package com.deloitte.javatraining.entity;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Main {
	public static void main(String[] args) {
		Customer customer = new Customer(1, "Ram", "Ayodhya", 500);                                                                                      
		//load hibernate connection
		Configuration configuration = new Configuration().configure();
		//create session factory
		SessionFactory factory = configuration.buildSessionFactory();
		//opening session
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(customer);
		transaction.commit(); 
		session.close();
		factory.close();
		System.out.println("Done");
	}
}

   