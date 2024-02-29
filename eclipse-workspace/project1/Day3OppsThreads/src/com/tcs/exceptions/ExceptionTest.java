package com.tcs.exceptions;

public class ExceptionTest {
	
	public static Exception method(RuntimeException r) throws Exception
	{
		if(r==null)
			 throw new Exception("Null Exception"); // it will throw as exception
			 else
				 return new RuntimeException("Returning without Exeption"); // No output but exception handled
	}
	
	public static void main(String[] args)
	{
		try {
			Exception e = method(new RuntimeException()); 
			System.out.println("Output" +e.getMessage());
			//Exception e = method(null); //Exception throws
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
