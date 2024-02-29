package com.tcs.designpattern;

public class CarFactory { //Factory pattern
	
	public static Car makeACar(String brand)
	{
		if(brand.equals("Hyundai"))
			return new Hyundai();
		else if(brand.equals("Toyota"))
			return new Toyota();
		else
			return null;
		
	}

}
