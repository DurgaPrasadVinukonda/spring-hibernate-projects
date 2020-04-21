package com.vs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;


@NamedNativeQueries({
	@NamedNativeQuery(
			name="findByTarak",
			query="select * from employee e where e.salary >:salary",
			resultClass=Employee.class
			)
	
})
@Entity
@Table(name = "employee")
//Defining a table name and entity class 
public class Employee {
	// This is a Pojo Class with getters and Setters
	// Write a @Column (name="id") of that Column name equal to database
	
	@Column(name = "id")
	private int id;
     @Id
	@Column(name = "employee")
	private String name;

	@Column(name = "salary")
	private int salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
