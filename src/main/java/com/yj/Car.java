package com.yj;

public class Car {
	
	private String engine;
	private String wheels;
	
	public Car(String engine,String wheels) {
		this.engine = engine;
		this.wheels = wheels;
	}
	
	public void start() {
		System.out.print(engine+"is on and "+ wheels + "are running!");
	}

}
