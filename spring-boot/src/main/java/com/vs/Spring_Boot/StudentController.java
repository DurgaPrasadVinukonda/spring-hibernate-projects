package com.vs.Spring_Boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vs.pojo.Student;
@RestController
public class StudentController {
	
	@RequestMapping("/getMessage")
	public String getMessage() {
		return "From Student Controller";
	}
	@RequestMapping("/getStudent")
	public Student getStudent() {
		Student st =new Student();
		st.setId(1);
		st.setName("Prasad");
		st.setState("CA");
		st.setCountry("USA");
		return st;
	}

}
