package com.vs.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.vs.entity.Employee;

public class EmployeeDAO {
	
	@Autowired
	private HibernateTemplate template;
	
	public void addEmployee(Employee employee) {
		template.save(employee);
	}
	
    public List<Employee>  getAllEmployees(){
    	List<Employee> employees =template.loadAll(Employee.class);
    	return employees;
    	
    }
}
