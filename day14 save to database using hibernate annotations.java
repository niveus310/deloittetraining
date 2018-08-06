package com.deloitte.javatraining.entity;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class Main {
	public static void main(String[] args) {
		Customer customer = new Customer(5,"Neha","Pune",15000);                                                                                      
		//load hibernate connection
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure();
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

   