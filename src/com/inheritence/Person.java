package com.inheritence;

public class Person {
	
	String fname;
	String lname;
	
	 Person (String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
		
		System.out.println("Person class -- fname  "+this.fname+"  lname    "+this.lname);
	}

}
