package com.annodemos.annotationdemos;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;



//import com.mypack.Dog;



@Configuration 
@ComponentScan(basePackages = {"com.mypack"})
public class MyConfig {
	
	@Bean("student1")
	@Lazy
	public Student getstudent() {
		System.out.println("creating 1st student object");
		Student st=new Student("student1");
		return st;
		
	}
	
	@Bean("student2")
	@Lazy
	public Student getstudent2() {
		System.out.println("creating 2nd student object");
		Student st=new Student("student2");
		return  st;
		
	}
	
	@Bean
	public person pers() {
		System.out.println("creating person object");
		return new person();
		
	}
	
//	@Bean
//	public Dog createdog() {
//		System.out.println("creating obj dog");
//		return new Dog();
//		
//	}
	

	

}
