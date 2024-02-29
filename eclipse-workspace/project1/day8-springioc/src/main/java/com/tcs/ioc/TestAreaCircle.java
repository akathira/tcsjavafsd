package com.tcs.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAreaCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans3.xml");
		Object radius = context.getBean("radius");
		Radius r=(Radius) radius;
		r.calculateRadius(3, 0, 4, 0);
		
		Object obj = context.getBean("circle");
		Circle b= (Circle) obj;
		b.area();
		
		
		
		
		

	}

}
