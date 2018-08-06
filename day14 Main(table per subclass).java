package InheritanceDemos2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
		 public static void main(String[] args) {
				//load hibernate connection
				Configuration configuration = new Configuration().configure("InheritanceDemos2/hello.cfg.xml");
				
				//create a sessionfactory
				SessionFactory factory = configuration.buildSessionFactory();
				
				//open session
				Session session = factory.openSession();
				
				Transaction transaction = session.beginTransaction();
				
				RegularEmployee employee = new RegularEmployee();
				employee.setEmployeeId(2);
				employee.setEmployeeName("Ritu");
				employee.setRegulareEmployeeBonus(9000);
				employee.setRegulareEmployeeSalary(150000);
				session.save(employee);
				
				Employee employee2 = new Employee();
				employee2.setEmployeeId(1);
				employee2.setEmployeeName("Renu");
				session.save(employee2);
				
				ContractEmployee employee3 = new ContractEmployee();
				employee3.setEmployeeId(3);
				employee3.setEmployeeName("Ripu");
				employee3.setDuration("9");
				employee3.setPayPerHour(800);
				session.save(employee3);
				
				transaction.commit();
				session.close();
				factory.close();
		}
}
