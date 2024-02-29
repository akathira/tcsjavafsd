package com.tcs.collections;

public class TestCollection4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Investor i1 = new Investor(1, "abc", "chennai", "shares", 50000);
		Investor i2 = new Investor(2, "nbc", "hyd", "bonds", 90000);
		Investor i3 = new Investor(3, "obc", "pune", "deposits", 80000);
		Investor i4 = new Investor(4, "jbc", "delhi", "shares", 40000);
		Investor i5 = new Investor(5, "ikl", "mumbai", "bonds", 20000);
		Investor i6 = new Investor(5, "ikl", "mumbai", "bonds", 20000);
		
		Transaction t1 = new Transaction(101, "01-Jan-2024", 8000,1);
		Transaction t2 = new Transaction(102, "02-Jan-2024", 8000,2);
		Transaction t3 = new Transaction(103, "03-Jan-2024", 8000,3);
		Transaction t4 = new Transaction(104, "04-Jan-2024", 8000,4);
		Transaction t5 = new Transaction(105, "05-Jan-2024", 8000,5);

	}

}
