package com.interfaceEx;

public abstract class Car implements RoadVehicle{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("--- Car is started ---");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("--- Car is stopped");
		
	}

}
