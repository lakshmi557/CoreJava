package com.abstraction;

public abstract class Employee {

	int empnum;
	String empname;
	
	abstract void job();
	abstract void timings();
	
	void noticePeriod() {
		System.out.println("Notice period is 2 months");
	}
	
}
