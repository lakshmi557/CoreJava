package com.sriTech.vms;

public class Employee {
	
	int empno;
	String empName;
	int salary;
	String empType;
	
	Employee(){
		empno = 10;
		empName = "Lakshmi";
		salary = 50000;
		empType = "Permanent";
	}
	
	Employee( int eno, String eName, int esalary, String eType){
		this();
		empno = eno;
		empName = eName;
		salary = esalary;
		empType = "eType";
	}
	
	void display() {
		System.out.println("emp name is --"+empName+" and sal is-- "+salary);
	}
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.display();
	}

}
