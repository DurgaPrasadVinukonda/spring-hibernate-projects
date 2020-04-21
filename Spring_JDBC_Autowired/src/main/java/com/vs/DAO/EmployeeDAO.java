package com.vs.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.vs.pojo.Employee;

public class EmployeeDAO {
	@Autowired
	@Qualifier("dataSourceOne")
	private DataSource dataSource;

//	public DataSource getDataSource() {
//		return dataSource;
//	}
//
//	public void setDataSource(DataSource dataSource) {
//		this.dataSource = dataSource;
//	}
	public List<Employee> findAllEmployees() throws SQLException{
		Connection con = dataSource.getConnection();
		Statement stmt =con.createStatement();
		ResultSet rs =stmt.executeQuery("select * from employee");
		List<Employee>employees =new ArrayList<Employee>();
		while(rs.next()) {
			int id =rs.getInt("id");
			String name =rs.getString("employee");
			int salary = rs.getInt("salary");
			Employee emp =new Employee();
			emp.setId(id);
			emp.setName(name);
			emp.setSalary(salary);
			employees.add(emp);
			
		}
		
		
		
		return employees;
	}
	public void addEmployee(Employee employee) {
		//insert into sql
	}
}
