package com.tcs.oops.encapsulation.constructors;

public class StaticDEmoTest {

	public static void main(String[] args) {
		
		System.out.println("test"); //class not loaded
		StaticDemo.operations(); // static block will be called, because now only class is loaded
        
		StaticDemo sd;
		sd = new StaticDemo();
		sd = new StaticDemo();
		sd = new StaticDemo();
		sd = new StaticDemo();
	}

}
