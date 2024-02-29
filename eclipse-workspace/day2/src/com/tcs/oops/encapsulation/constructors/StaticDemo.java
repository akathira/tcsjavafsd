package com.tcs.oops.encapsulation.constructors;

public class StaticDemo {
	
	int data; //instance variable or member
	static int item; //static variable or member
	
	//non static method
	void method() {
		data=10;
		item=2;
		
	}
	
	static void operations() {
		//data= 2;
		item=10;
	}
	
	static class myClassStatic{
		
	}
	
	{
		System.out.println("Normal intance");
	}
	
	static{
		System.out.println("static block");
	}
	
	class myClass{
		
	}

}
