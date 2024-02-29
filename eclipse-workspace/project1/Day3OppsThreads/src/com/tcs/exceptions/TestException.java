package com.tcs.exceptions;

import java.io.*;


//An exception is an object
//An objects are created in runtime
public class TestException {
	public static void main(String[] args) {
		
		
		try {
			System.out.println(10/0);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.toString());
		}
		System.out.println("After Division");
		
		try {
			FileInputStream f=new FileInputStream("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
