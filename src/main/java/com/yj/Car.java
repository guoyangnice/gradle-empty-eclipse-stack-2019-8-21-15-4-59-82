package com.yj;

public class Car {
	
	private String engine;
	private String wheels;
	
	public Car(String engine,String wheels) {
		this.engine = engine;
		this.wheels = wheels;
	}
	
	public String getEngine() {
		return engine;
	}
	
	public String getWheels() {
		return wheels;
	}
	
	public void start() {
		System.out.println(engine+"is on and "+ wheels + "are running!");
	}

}
