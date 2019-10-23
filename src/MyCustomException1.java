package com.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class MyCustomException1 {
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
		try
		{
			System.setErr(new PrintStream(new File("err.log")));
			System.setOut(new PrintStream(new File("out.log")));
		}
		catch(FileNotFoundException de) {
			de.printStackTrace();
		}
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
