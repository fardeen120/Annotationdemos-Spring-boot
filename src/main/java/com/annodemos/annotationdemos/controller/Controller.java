package com.annodemos.annotationdemos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.annodemos.annotationdemos.Student;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	@Qualifier("student1")
	private Student student;
	
	@RequestMapping(value = "/home",method = RequestMethod.GET)
	@ResponseBody
	public Student home(@RequestBody Student st) {
		st.study();
		System.out.println("this is home page");
		this.student.setName("fardeen khan");
		return this.student;
		
	}
	
	@RequestMapping(value = "/user/{userid}",method = RequestMethod.GET )
	public String user(@PathVariable("userid")Integer userid) {
		return String.valueOf(userid);
		
	}

}

