package com.test.oops.encapsulation.statictest;

import com.test.oops.encapsulation.statictest.Investors;

public class CreateInvestors {
public static void main(String[] args) {
	
	Investors i1=new Investors(101, "joh", "Anna salai", 2000);
	System.out.println(i1.getCount());
	Investors i2=new Investors(101, "joh", "Anna salai", 2000);
	System.out.println(i2.getCount());
	Investors i3=new Investors(101, "joh", "Anna salai", 2000);
	System.out.println(i3.getCount());
	Investors i4=new Investors();
	System.out.println(i4.getCount());
	i1.setCount(900);
	Investors i5=new Investors();
	System.out.println(i5.getCount());
	
	
}
}
