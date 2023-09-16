package com.annodemos.annotationdemos;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mypack.Dog;



@SpringBootApplication
public class AnnotationdemosApplication implements CommandLineRunner {
	
	@Autowired
	@Qualifier("student1")
	private Student student;
	

	
	@Autowired
	private Emp emp;
	
	@Autowired
	private person person;
	
	@Autowired
	private Dog dog;

	public static void main(String[] args)  {
		SpringApplication.run(AnnotationdemosApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		this.student.study();
		this.emp.myname();
		this.person.getp();
		this.dog.getdog();
		
	}

}
