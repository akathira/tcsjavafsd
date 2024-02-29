package com.tcs.oops;

public class CreateInvestors {

	public static void main(String[] args) {
		Investors i=new Investors();
		//i is reference to an object which will be created in memory at runtime which be given a copy of all the data members for the class
        i.id=10;
        i.name="John";
        i.address="12th Main";
        i.amount=23.90d;
        
        System.out.println(i);
        try {
			String str = i.getClass().getName() + '@' + Integer.toHexString(i.hashCode());
		    System.out.println(str);
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
