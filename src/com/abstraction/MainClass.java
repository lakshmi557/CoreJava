package com.abstraction;

public class MainClass {
	
	public static void main(String[] args) {
		Employee emp;
		emp = new Programmer();
		emp.job();
		
		emp = new Analyst();
		emp.job();
		
		emp = new Manager();
		emp.job();
	}

}
