package com.vs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vs.model.Student;

@Controller
public class HelloController {

	// So that when ever we hit this url we will get the data present in this
	// controller
	@RequestMapping("/getMessage")
	public String getMessage(Model model) {
		System.out.println("Inside get method");
		model.addAttribute("data", "Message From Controller");
		return "hello";
	}
     @RequestMapping("/student")
	public String register(Student student,Model model) {
    	 System.out.println(student.getStudentName());
    	 model.addAttribute("name","message from a register");
		return "student";
	}

}
