package com.exception;

public class MyCustomException {
	public static int divide(int no1, int no2) throws DivideByzeroException
	{
		int result = 0;
		if(no2<=0)
		{
			throw new DivideByzeroException("Cannot divide by ZERO...");
			
		}
		return no1/no2;
	}
	

	public static void main(String[] args)
	{
		int no1,no2,result;
		no1=no2=result=0;
		no1 = 10;	no2 = 0;
		System.out.println("starting...");
		try
		{
			result = divide(no1, no2);
			System.out.println("result\n"+result);
		}
		catch(DivideByzeroException de) {
			System.err.println(de.getMessage());
		}
		
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println("ending.....");
	}

}
