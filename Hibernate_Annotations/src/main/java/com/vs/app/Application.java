package com.vs.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.vs.entity.Employee;

public class Application {

	public static void main(String[] args) throws SecurityException {
		// Create the configuration
		Configuration config = new Configuration();
		// Read The configuration
		config.configure();
		// Session Factory
		SessionFactory factory = config.buildSessionFactory();
		// Need to open the session
		Session session = factory.openSession();

		// Object Creation for Employee
		Employee emp = new Employee();
		emp.setId(20);
		emp.setName("Pavan");
		emp.setSalary(8675);
//		Transaction tx = session.beginTransaction();
////		Integer id = (Integer) session.save(emp);
////		System.out.println("Generated ID is "+id);
////	session.update(emp);
//		session.saveOrUpdate(emp);
//	      tx.commit();
//		Now we are getting a employee data for particular Id 
		Employee employee = session.get(Employee.class, 1);
		System.out.println(
				"Id is " + employee.getId() + "Name is " + employee.getName() + "Salary is " + employee.getSalary());
		session.close();
		factory.close();

	}

}
