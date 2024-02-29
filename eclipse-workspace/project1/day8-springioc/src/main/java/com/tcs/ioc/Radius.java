package com.tcs.ioc;

public class Radius {
	
	int x;
	int y;
	int h;
	int k;
	double radius;
	
	
	public Radius() {
		super();
	}

	public double calculateRadius(int x, int y, int h, int k)
	{
		double result = Math.pow((x-h), 2) +  Math.pow((y-k), 2);
		radius= Math.sqrt(result);
		System.out.println("Radius"+ radius);
		return radius;
	}

	public Radius(int x, int y, int h, int k, double radius) {
		super();
		this.x = x;
		this.y = y;
		this.h = h;
		this.k = k;
		this.radius = radius;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	

}
