package com.yj;

public class SportsCar extends Car{
	
	private String lights;
	private String engine;
	private String wheels;
	
	public SportsCar(String lights,String engine, String wheels) {
		super(engine, wheels);
		this.lights = lights;
	}

	public void start() {
		System.out.println(lights+"are shining,"+ getEngine() +" is on and "+ getWheels() + " are running!");
	}
	
}
