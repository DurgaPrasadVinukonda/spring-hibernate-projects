package com.vs.app;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.vs.entity.Employee;

public class Application {
	/** 
	 * This is a class for Main Method used for creating config
	 * @param args
	 * @throws SecurityException
	 */

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
		//HQL Query we should not 
		String hql ="from Employee where salary >2000";
		Query hqlQuery =session.createQuery(hql);
		List<Employee> empList =hqlQuery.getResultList();
	  for (Employee employee:empList) {
		  System.out.println("Id is "+employee.getId()+"  Name is "+employee.getName()+"Slary is "+employee.getSalary());
		  
	  }
		
		session.close();
		factory.close();

	}

}
