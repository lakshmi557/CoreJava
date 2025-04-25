package com.inheritence;

public class Details extends Trainer{
	
	Details(){
		super("Spring", 80000, "Permanent");
		System.out.println("This is Details Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Trainer trainer = new Trainer("Java", 50000, "Permanent");
		Student student = new Student(999, "Channai");
		Details details = new Details();

	}

}
