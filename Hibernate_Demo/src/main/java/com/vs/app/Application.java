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

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
         Configuration config =new Configuration();
        config= config.configure();
        //Read Configuration
        SessionFactory factory =config.buildSessionFactory();
        Session session =factory.openSession();
        Employee employee =new Employee();
        employee.setId(6);
        employee.setName("Dhana");
        employee.setSalary(12000);
        Transaction tx =(Transaction) session.beginTransaction();
        session.save(employee);
        tx.commit();
        session.close();
        factory.close();
	}

}
