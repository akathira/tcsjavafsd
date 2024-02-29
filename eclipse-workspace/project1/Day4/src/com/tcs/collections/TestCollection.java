package com.tcs.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestCollection{
	public static void main(String[] args) {
		Investor i1 = new Investor(1, "abc", "chennai", "shares", 50000);
		Investor i2 = new Investor(2, "nbc", "hyd", "bonds", 90000);
		Investor i3 = new Investor(3, "obc", "pune", "deposits", 80000);
		Investor i4 = new Investor(4, "jbc", "delhi", "shares", 40000);
		Investor i5 = new Investor(5, "ikl", "mumbai", "bonds", 20000);
		Investor i6 = new Investor(5, "ikl", "mumbai", "bonds", 20000); // same object as i5, but it's unique key only. 
		// If we have overriden hashcode & equals method, it will check the objects values. If not implemented, 
		//then it will check the object keys
		Investor i7 = i6; //shares same hashcode value 
		
		
		TreeSet<Investor> set = new TreeSet<>(); // we can't get element from set as there is no index
		set.add(i7);
		set.add(i6);
		set.add(i5);
		set.add(i4);
		set.add(i1);
		set.add(i2);
		set.add(i3);
		
		
		
		Iterator<Investor> it = set.iterator();
		while (it.hasNext())
		{
			Investor i = it.next();
			System.out.println(i);
			
		}
		System.out.println(set.size());
		
	}

}
