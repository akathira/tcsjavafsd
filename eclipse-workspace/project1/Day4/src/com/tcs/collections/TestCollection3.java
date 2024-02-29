package com.tcs.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class TestCollection3{
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
		
		HashMap<Integer, Investor> datamap=new HashMap<>();
		datamap.put(i5.getId(), i5);
		datamap.put(i3.getId(), i3);
		datamap.put(i2.getId(), i2);
		datamap.put(i4.getId(), i4);
		datamap.put(i1.getId(), i1);
	

		//Map view
		//Key view, the value view and the key value view.

		System.out.println(datamap);
		System.out.println(datamap.get(5));
		
		System.out.println(datamap.get(4));
		i5.setInstrument("shares");
		datamap.put(i5.getId(),i5 );
		
		System.out.println(datamap.get(5));
		
		Set<Integer> keys = datamap.keySet();
		System.out.println(keys);
		
		Collection<Investor> values = datamap.values();
		System.out.println(values);
		
		
		Set<Entry<Integer, Investor>> keyvalues = datamap.entrySet();
		
		Iterator<Entry<Integer, Investor>> iter = keyvalues.iterator();
		while(iter.hasNext())
		{
			Entry<Integer, Investor> entry = iter.next();
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
		/*
		 * TreeSet<Investor> set = new TreeSet<>(); // we can't get element from set as
		 * there is no index set.add(i7); set.add(i6); set.add(i5); set.add(i4);
		 * set.add(i1); set.add(i2); set.add(i3);
		 * 
		 * 
		 * 
		 * Iterator<Investor> it = set.iterator(); while (it.hasNext()) { Investor i =
		 * it.next(); System.out.println(i);
		 * 
		 * } System.out.println(set.size());
		 */
		
	}

}
