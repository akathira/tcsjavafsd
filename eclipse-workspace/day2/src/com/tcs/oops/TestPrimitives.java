package com.tcs.oops;

public class TestPrimitives {

	public static void main(String[] args) {
		byte b=10; //1 byte
		final int i=10; //4 byte
		b=i; // 4byte can'y be stored in 1byte
		validate(b);
		
		short a = 10;
		short c= 20;
		int v=a+c;
		
		
	}
	
	static void validate(byte b)
	{
		b++;
	}
	
	

}
