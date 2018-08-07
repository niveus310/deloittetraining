package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

		public static void main(String[] args) {
			/*Employee employee = new Employee();
			employee.setEmployeeName("sakshi");
			System.out.println(employee);*/
			
			Resource resource = new ClassPathResource("beans.xml");
			BeanFactory factory = new XmlBeanFactory(resource);
			Employee employee=(Employee) factory.getBean("emp");
			System.out.println(employee);
			employee=(Employee) factory.getBean("emp2");
			System.out.println(employee);
			Address address = (Address) factory.getBean("add");
			System.out.println(address);
			Employee employee2 = (Employee) factory.getBean("employee");
			System.out.println(employee2);
			}
}
