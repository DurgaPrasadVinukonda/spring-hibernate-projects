package com.vs.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vs.pojo.Student;

@RestController
public class StudentController {
	@RequestMapping("/createStudent")
	public Student createStudent() {
		Student st =new Student();
        st.setID(1);
        st.setName("prasad");
        st.setCountry("USA");
		return st;
	}

}
