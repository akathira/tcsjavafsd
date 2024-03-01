package com.tcs.training;

public class TestLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int start = 1;
		int stop = 100;
		while(start <= stop)
		{
			System.out.println("Run");
			start++;
		}
		
		System.out.println("------------------");
		
		for(start =1; start<=stop; start++)
		{
			System.out.println(start);
		}
		System.out.println("------------------");
		
		for(stop =100; stop>=start; start--)
		{
			System.out.println(start);
		}
		System.out.println("------------------");
		for(start =1; start<=stop/2; start++)
		{
			System.out.println(start);
		}
		System.out.println("------------------");
		for(start =1; start<=stop; start+=2)
		{
			System.out.println(start);
		}
		
		System.out.println("------------------");

		for(start =1; start<=stop; start++)
		{
			int sum=0;
			sum = sum + start; 
			start++;
			int sum1st = sum + start;
			start++;
			int sum2nd = sum1st + start;
		    System.out.println(sum2nd);	
			
			
		}
		
		System.out.println("------------------");
		int sum =0;
		int count=1;
		
		for(start =1; start<=stop; start+=3)
		{
			for(int i=start; i<start+3;i++)
			{
				sum += i;
				
			}
			System.out.println(sum);
			sum=0;
		}
		
		System.out.println("------------------");
		int i=0;
		for(;i<=20;i++);
		{
			System.out.println(i);
		}
		
		System.out.println("------------------");
		
		long p = 1000000;
		double in=13/100;
		int n=25;
		
		double r= in/(p*n);
		
		//double a = p * (1 + r/n)nt;
		
		double total =0.0;
		
		for(int j=0;j<=n;j++)
		{
			total += (p * (Math.pow((1 + r/j), j*n)));
			System.out.println(total);
		}
		
		
	}

}
