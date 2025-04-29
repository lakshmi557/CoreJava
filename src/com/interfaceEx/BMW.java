package com.interfaceEx;

public class BMW extends Car{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car bmw = new BMW();
		bmw.runOnRoad();
		bmw.start();
		bmw.stop();
	}

	@Override
	public void runOnRoad() {
		// TODO Auto-generated method stub
		System.out.println("----- B M W vehicle is a luxury car and it will go on road too fast --");
		
	}


	
}
