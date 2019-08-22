package com.yj;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car("{engine}","{wheels}") ;
		car.start();
		
		SportsCar sportsCar = new SportsCar("{lights}","{engine}","{wheels}");
		sportsCar.start();
	}

}
