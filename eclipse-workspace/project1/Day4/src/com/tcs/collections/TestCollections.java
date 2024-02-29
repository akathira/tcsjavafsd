package com.tcs.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestCollections {
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
		
		
		HashSet<Investor> set = new HashSet<>(); // we can't get element from set as there is no index
		set.add(i1);
		set.add(i2);
		set.add(i3);
		set.add(i4);
		set.add(i5);
		set.add(i6);
		set.add(i7);
		set.add(null);
		set.add(null);
		
		System.out.println(set.size());
		System.out.println("---------");
		Iterator<Investor> it=set.iterator();
		while(it.hasNext())
		{
			Investor i = it.next();
			System.out.println(i);
		}
		
		ArrayList<Set<Investor>> list = new ArrayList<>();
		list.add(set);
		HashSet<Investor> set2 = set;
		HashSet<Investor> set3 = set;
		
		list.add(set2);
		list.add(set3);
		
		System.out.println(list.size());
		System.out.println(list);
		
		Set<Investor> item = list.get(2);
		for(Investor i: item)
		{
			System.out.println(i);
		}
		
		
	}

}
