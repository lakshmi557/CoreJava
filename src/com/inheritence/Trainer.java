package com.inheritence;

public class Trainer extends Student{

	String subject;
	int salary;
	String type;
	
	Trainer(String subject, int salary,String type){
		super(557, "Manikonda, Hyderabad");
		this.subject = subject;
		this.salary = salary;
		this.type = type;
		
		System.out.println("Trainer class -- subject  "+this.subject+"  salary    "+this.salary+" Job type "+this.type);
	}
}
