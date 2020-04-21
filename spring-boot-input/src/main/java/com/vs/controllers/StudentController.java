package com.vs.controllers;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vs.pojo.Student;

@RestController
public class StudentController {
	//Creating a Student 
	@RequestMapping("/createStudent")// /{id}/{name}/{country}")
	//This is for Oridinary variables 
//	public Student createStudent(Integer id,String name,String country) {
	//This is for Requesting Param 
	//Http://localhost:9191/createStudent?id=1&name="prasad"&country="usa"
//	public Student createStudent(@RequestParam Integer id ,@RequestParam(name="studentName") String name,@RequestParam String country) {
	//this below method is for //http://localhost:9191/createStudent/1/sai/usa
//	public Student createStudent(@PathVariable Integer id,@PathVariable String name,@PathVariable String country) {
	//if we are taking a lot of paramters
	public Student createStudent(@RequestBody Student st) {
//	Student st = new Student();
//		st.setId(id);
//		st.setName(name);
//		st.setCountry(country);
//		System.out.println("Id is "+st.getId()+"name is "+st.getName()+"country is "+st.getCountry());
		return st;
		
	}

}
