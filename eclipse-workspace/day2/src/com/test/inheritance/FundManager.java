package com.test.inheritance;
import com.test.inheritance.Bond;

public class FundManager {

	    public static void main(String[] args) {
	        Bond govtBond = new Bond(1, "GovtBond", "FixedRateBond", 50000, "30/01/2024", "30/01/2025");
	        
	        System.out.println(govtBond);
	    }
	

}
