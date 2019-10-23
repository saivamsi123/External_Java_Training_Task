package com.interfaces;

import java.util.Scanner;

interface IStack
{
	public void push(int number);
	public int pop();
}

class Stack implements IStack{
	
	protected int[] stackArray;
	protected int tos;
	
	public Stack(int capacity)
	{
		stackArray = new int[capacity];
		tos = -1;
	}
	
	@Override
	public void push(int number) {
		System.out.print(tos+" \n");
		if(tos>=stackArray.length)
		{
			throw new StackOverflowError();
		}
		else 
		{
			stackArray[++tos] = number;
			
			//System.out.println(number+" pushed into stack ");
		}
		
		
	}

	@Override
	public int pop() {
		if(tos<0)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		else
		{
			int x = stackArray[tos--];
			return x;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack stack = new Stack(1000);
		int number = 0;
		System.out.print("Enter input:");
		number = sc.nextInt();
		for(int i = 0;i < stack.stackArray.length;i++)
		{
			number = number + 10;
			stack.push(number);
		}
		System.out.print("pop element is:");
		System.out.print(stack.pop());
	    
	}

}
