package com.tcs.ioc;

public class A {

	public void method(){
		System.out.println("From A");
	}

	public void myInit() {
		System.out.println(getClass() + "init()");
	}

	public void myDestroy() {
		System.out.println(getClass() + "destroy");
	}
}
