package com.tcs.ioc;

import org.springframework.beans.factory.annotation.Qualifier;

public class B4 {
	
	A4 a; //dependencies
	//beans are called objects, it was created by bean factory.

	
	@Qualifier("a1")
	public void other()
	{
		//A a = new A(); 
		a.method(); ///inversion of conversion -> giving the control to another object & should not use new keyword
	}
	
	public void setA4(A4 a)
	{
		this.a=a;
	}
}

