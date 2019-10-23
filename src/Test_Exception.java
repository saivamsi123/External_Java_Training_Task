package com.exception;

public class Test_Exception {
	
	public static int divide(int no1, int no2) throws Exception
	{
		int result = 0;
		if(no2<=0)
		{
			throw new Exception("Cannot divide by ZERO...");
			
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
		
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println("ending.....");
	}
	public static void main4(String[] args)
	{
		int no1,no2,result;
		no1=no2=result=0;
		System.out.println("starting...");
		try
		{
			no1=Integer.parseInt(args[0]);
			no2=Integer.parseInt(args[1]);
			result =no1/no2;
			System.out.println("result\n"+result);
		}
		catch(ArithmeticException ae) {
			System.err.println("please enter two arguments..."+ae);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.err.println("please enter two arguments..."+ex);
		}
		catch(NumberFormatException nfe) {
			System.err.println("please enter two arguments..."+nfe);
		}
		
		catch(Exception e) {
			System.err.println("please enter two arguments..."+e);
		}
		System.out.println("ending.....");
	}
	public static void main1(String[] args) {
		if(args.length != 2)
		{
			System.out.println("please provide runtime arguments...");
			return;
		}
		
		int no1, no2, result;
		System.out.println("starting...");
		
		no1 = Integer.parseInt(args[0]);
		System.out.println("1st argument passed...");
		no2 = Integer.parseInt(args[1]);
		System.out.println("2nd argument passed...");
		
		result = no1/no2;
		System.out.println("Arithmetic Operation performed");
		
		System.out.println("Result:"+result);
		System.out.println("ending...");
		
	}
	public static void main2(String[] args)
	{
		int no1,no2,result;
		no1=no2=result=0;
		System.out.println("starting...");
		try
		{
			no1=Integer.parseInt(args[0]);
			no2=Integer.parseInt(args[1]);
			result =no1/no2;
			System.out.println("result\n"+result);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.err.println("please enter two arguments..."+ex);
		}
		catch(NumberFormatException nfe) {
			System.err.println("please enter two arguments..."+nfe);
		}
		System.out.println("ending.....");
	}
	public static void main3(String[] args)
	{
		int no1,no2,result;
		no1=no2=result=0;
		System.out.println("starting...");
		try
		{
			no1=Integer.parseInt(args[0]);
			no2=Integer.parseInt(args[1]);
			result =no1/no2;
			System.out.println("result\n"+result);
		}
		catch(ArithmeticException ae) {
			System.err.println("please enter two arguments..."+ae);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.err.println("please enter two arguments..."+ex);
		}
		catch(NumberFormatException nfe) {
			System.err.println("please enter two arguments..."+nfe);
		}
		
		catch(Exception e) {
			System.err.println("please enter two arguments..."+e);
		}
		System.out.println("ending.....");
	}

}
class DivideByzeroException extends Exception
{
	public DivideByzeroException(String title)
	{
		super(title);
	}
	
	@Override
	public String getMessage() {
		
		return "DivideByzeroException->"+super.getMessage();
	}
}