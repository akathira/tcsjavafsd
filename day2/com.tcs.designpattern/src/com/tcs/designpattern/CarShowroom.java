package com.tcs.designpattern;

public class CarShowroom {
	public static void main(String[] args) {
		Car car = CarFactory.makeACar("Hyundai");
		System.out.println(car);
		
		car = CarFactory.makeACar("Toyota");
		System.out.println(car);
	}

}
