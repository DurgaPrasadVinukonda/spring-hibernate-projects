package com.vs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	//So that when ever we hit this url we will get the data present in this controller
	@RequestMapping("/getMessage")
	public String getMessage() {
		System.out.println("Inside get method");
		return "hello";
	}

}
