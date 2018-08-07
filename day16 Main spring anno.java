package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

		public static void main(String[] args) {
			
			ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			
			Employee employee=context.getBean(Employee.class);
			Address address =context.getBean(Address.class);
			employee.setEmployeeName("Nivetha");
			address.setId(21);
			address.setCity("Chennai");
			address.setState("TN");
			//employee.setAddress(address);
			Employee employee2=context.getBean(Employee.class);
			employee2.setEmployeeName("Nivetha");
			System.out.println(employee);
			System.out.println(employee2);
			}
}
