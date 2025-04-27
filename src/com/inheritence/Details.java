package com.inheritence;

public class Details{
	
	Details(){
//		super("Spring", 80000, "Permanent");
		System.out.println("This is Details Class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Remove extends as main class might not require.
		// Pass dynamic values from main class to 
		
		
		Trainer trainer = new Trainer("Java", 50000, "Permanent", 999, "Chennai");
//		Student student = new Student(999, "Chennai");
		Details details = new Details();

	}

}
