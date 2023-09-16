package com.annodemos.annotationdemos;

public class Student {
	
	String name;
	
	

	



	public Student() {
		super();
		
	}



	public void study() {
		System.out.println(name + " is studying");
	}



	public Student(String name) {
		super();
		this.name = name;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

}
