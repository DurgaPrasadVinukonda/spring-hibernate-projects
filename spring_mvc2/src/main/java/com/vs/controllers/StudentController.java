package com.vs.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vs.model.Student;
@RestController
public class StudentController {
	@RequestMapping("/getStudent")
	public Student getStudent() {
		Student st =new Student();
		st.setStudentName("Prasad Vinukonda");
		st.setCountry("USA");
		st.setAge(22);
		return st;
	
	}
	@RequestMapping("/getMessageTwo")
	public String getMessage(Model model) {
		System.out.println("Inside get method");
		model.addAttribute("data", "Message From Controller");
		return "hello";
	}
	public String removeSpecialChars(String str) {
		str= str.replaceAll("@","");
		return str;
	}

}
