package com.tcs.oops.encapsulation.constructors;

import com.tcs.oops.encapsulation.constructors.Investors;

public class CreateInvestors {

	public static void main(String[] args) {
		Investors i1=new Investors(101, "joh", "Anna salai", 2000);
		System.out.println(i1);
		Investors i2=new Investors(101, "joh", "Anna salai", 2000);
		
		boolean result = i1==i2;
		System.out.println(result);
		
		boolean res = i1.equals(i2);
		System.out.println(res);
		
		boolean result2 = i1==i2;
		System.out.println(result2);
		
		i2.setAmount(5000);
		System.out.println(i2);
		

	}

}
