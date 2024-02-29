package com.tcs.ioc;

public class Circle {
	
	Radius radius;


	public void setRadius(Radius radius) {
		this.radius = radius;
	}
	
	public double area() {
		double area = Math.PI * Math.pow(radius.getRadius(), 2);
		System.out.println("Area"+area);
		return area;
				
	}

}
