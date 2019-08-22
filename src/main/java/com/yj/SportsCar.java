package com.yj;

public class SportsCar extends Car{
	
	private String lights;
	
	public SportsCar(String lights,String engine, String wheels) {
		super(engine, wheels);
		this.lights = lights;
	}

	public void start() {
		System.out.println(lights+"are shining,"+ getEngine() +" is on and "+ getWheels() + " are running!");
	}
	
	public void speedOn() {
		System.out.println(getEngine() +" is overload and " + getWheels()+" are super running!"); 
	}
	
}
