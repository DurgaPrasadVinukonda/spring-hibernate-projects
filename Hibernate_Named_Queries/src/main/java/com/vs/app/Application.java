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
//		emp.setId(20);
//		emp.setName("Pavan");
//		emp.setSalary(8675);
//		Transaction tx = session.beginTransaction();
////		Integer id = (Integer) session.save(emp);
////		System.out.println("Generated ID is "+id);
////	session.update(emp);
//		session.saveOrUpdate(emp);
//	      tx.commit();
//		Now we are getting a employee data for particular Id 
//		Criterion salaryCondition =Restrictions.gt("salary", 6000);
//		Criteria criteria = session.createCriteria(Employee.class);
//		//Added Criterian with criteria
//		 criteria =criteria.add(salaryCondition);
		
		//Call the Named Native Query method and assing to a query 
		Query namedQuery=session.getNamedNativeQuery("findByTarak");
		namedQuery = namedQuery.setParameter("salary", 6000);
		List<Employee>emplist =namedQuery.getResultList();
		 //Now need to create a list and assign to a employee list
//		 List<Employee>emplist=criteria.list();
		 for(Employee employeelist:emplist) {
			 System.out.println("ID is"+employeelist.getId()+" Name is "+employeelist.getName()+"Salary is "+employeelist.getSalary());
		 }
//		Employee employee = session.get(Employee.class, 1);
//		System.out.println(
//				"Id is " + employee.getId() + "Name is " + employee.getName() + "Salary is " + employee.getSalary());
		session.close();
		factory.close();

	}

}
