package com.tcs.ioc;

public class C {
	
	A a;

	public C(A a) {
		super();
		this.a = a;
	}

	public C() {
		super();
	}
	
	public void other()
	{
		System.out.println(getClass());
		a.method();
	}
	
	public void myDestroy() {
		System.out.println(getClass() + "destroy");
	}

}
