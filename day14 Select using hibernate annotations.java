package com.deloitte.javatraining.entity;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class MainSelect {
	public static void main(String[] args) {
		Customer customer = new Customer();
		//load hibernate connection
		Configuration configuration = new Configuration().configure();
		//create session factory
		SessionFactory factory = configuration.buildSessionFactory();
		//opening session
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		customer = (Customer) session.get(Customer.class,3);
		System.out.println(customer);
		customer.setBillAmount(19000);
		System.out.println(customer);
		
		transaction.commit(); 
		session.close();
		factory.close();
		System.out.println("Done");
	}
}
