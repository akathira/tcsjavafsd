package com.tcs.training;

public class TestArrays {
	
	public static void main(String[] args) {
		
		int data[]= {25,25,85,74,65};
		
		for(int i:data)
		{
			System.out.println(i);
		}
		
		for(int i=0;i<data.length;i++)
		{
			System.out.println(data[i]);
		}
		
		for(int i: data)
		{
			if(i%2 ==0)
				System.out.println(i);
			
		}
	}

}
