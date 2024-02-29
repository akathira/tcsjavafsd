package com.tcs.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeans2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
		//IOC container initialized
	    // block the main thread, so it will give chance to destroy the other threads.
		Object obj = context.getBean("b");
		B b= (B) obj;
		b.other();
		
		C c= (C) context.getBean("c");
		c.other();
		boolean result = context.isPrototype("c");// It can be singleton by default 
		System.out.println(result);
		result = context.isPrototype("a");
		System.out.println(result);	
		context.registerShutdownHook(); 
	}

}
