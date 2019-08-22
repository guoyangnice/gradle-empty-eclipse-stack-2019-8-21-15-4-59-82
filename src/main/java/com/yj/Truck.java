package com.yj;

public class Truck extends Car{

	private String payload;
	
	public Truck(String engine, String wheels) {
		super(engine, wheels);
		// TODO Auto-generated constructor stub
	}
	
	public void start() {
		System.out.println("tips,"+ getEngine() + " is on and "+ getWheels() + " are running!");
	}
	
	public void load(String payload) {
		this.payload = payload;
		System.out.println(payload + "is loading goods");
	}
	

}
