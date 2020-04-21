package com.vs.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vs.dao.EmployeeDAO;
import com.vs.entity.Employee;

public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean.xml");
		//Getting bean by name //context.getBean("dao");
		//Getting bean by type 
		EmployeeDAO dao = context.getBean(EmployeeDAO.class);
		List<Employee> employees =dao.getAllEmployees();
		for(Employee emp:employees) {
			System.out.println("Id is "+emp.getId()+" ,Name is "+emp.getName()+" ,Salary is "+emp.getSalary());
		}
	}

}
