package com.deloitte.javatraining.entity;

import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

public class GetAllRecord {
	public static void main(String[] args) {
		Customer customer = new Customer();
		//load hibernate connection
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure();
//create session factory
		SessionFactory factory = configuration.buildSessionFactory();
		//opening session
		Session session = factory.openSession();
		
		Query query = session.createQuery("from com.deloitte.javatraining.entity.Customer");
		Iterator<Customer> i = query.iterate();
		
		while(i.hasNext())
		{
			customer=i.next();
			System.out.println(customer);
		}
	}


}
