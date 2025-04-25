package com.inheritence;

public class Student extends Person {
	
	int studentnum;
	String studentAddress;
	
	Student(int studentnum, String studentAddress){
		super("kunta", "Lakshminarayna");
		this.studentnum = studentnum;
		this.studentAddress = studentAddress;
		
		System.out.println("Stdent class -- studentnum  "+this.studentnum+"  studentAddress    "+this.studentAddress);
	}

}
