package com.tcs.oops.encapsulation;

import com.tcs.oops.encapsulation.Investors;

public class CreateInvestors {

	public static void main(String[] args) {
		
		Investors i1=new Investors();
		i1.setId(1);
		i1.setAddress("12th Main)");
		i1.setAmount(42552.89);
		i1.setName("xx");
		
		Investors i2=new Investors();
		i2.setId(2);
		i2.setAddress("13th Main)");
		i2.setAmount(48552.89);
		i2.setName("YY");
		
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		Investors i3=i1;
		//creating new reference from existing object
		
		System.out.println(i1.hashCode());
		System.out.println(i3.hashCode());
		
		i3=null;
		boolean bo = i1==i3;
		System.out.println(bo);

	}

}
