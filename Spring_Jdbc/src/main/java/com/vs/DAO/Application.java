package com.vs.DAO;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vs.pojo.Employee;

public class Application {

	public static void main(String[] args) throws SQLException {
	ApplicationContext context =  new ClassPathXmlApplicationContext("spring-bean.xml");
	EmployeeDAO  empDAO= context.getBean(EmployeeDAO.class);
	List<Employee> empList= empDAO.findAllEmployees();
	for (Employee emp:empList) {
		System.out.println("ID:"+emp.getId()+", Name"+emp.getName()+",Salary"+emp.getSalary());
	}
	
		
		

	}

}
