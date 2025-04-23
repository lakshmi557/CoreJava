package com.sriTech.vms;

public class Student {

	int sno;
	String sname;
	int m1, m2, m3;
	
	void displayDetails() {
		System.out.println("Student Number -- "+sno+" Student name --  "+sname);
	}
	
	void displayStdPermance(int m1, int m2, int m3) {
		
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		int sum = m1 + m2 + m3;
		float avg = sum/3;
		
		System.out.println("m1 marks -- "+ m1+"  m2 marks --"+m2+"  m3 marks -- "+m3);
		System.out.println("Average marks --  "+ avg);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		s1.displayDetails();
		s1.displayStdPermance(75, 80, 90);
	}

}
