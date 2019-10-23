package com.array;

import java.util.Arrays;

public class RandomArray {
//	public static String min(int arr[]) {
//		Arrays.sort(arr);
//		return Arrays.toString(arr[0]);
//		//return Arrays.toString(arr);
//	}
	
	public static void getOdd(int arr[])
	{
		for(int i = 0;i< arr.length; i++)
		{
			if(arr[i] % 2 !=0)
			{
				System.out.print( "," + arr[i]);
			}
		}
	}
 
	public static void main(String[] args) {
		int arr[] = new int[10];
		System.out.println(Arrays.toString(arr));

		for (int index = 0; index < arr.length; index++) {
			arr[index] = (int) (Math.random() * 100);
		}
		System.out.println(Arrays.toString(arr));
		getOdd(arr);
	}

}
