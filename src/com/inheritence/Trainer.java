package com.inheritence;

public class Trainer extends Student{

	String subject;
	int salary;
	String type;
	
	Trainer(String subject, int salary,String type, int studentnum, String studentAddress ){
		super(studentnum, studentAddress);
		this.subject = subject;
		this.salary = salary;
		this.type = type;
		
		System.out.println("Trainer class -- subject  "+this.subject+"  salary    "+this.salary+" Job type "+this.type);
	}
}
