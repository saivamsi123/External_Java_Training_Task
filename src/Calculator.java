package com.basic;

import java.lang.*;
import java.util.*;
import java.io.*;

public class Calculator {
	public static void add(int x, int y) {
		int s;
		s = x + y;
		System.out.println(s);
	}

	public static void sub(int x, int y) {
		int s;
		s = x - y;
		System.out.println(s);
	}

	public static void mul(int x, int y) {
		int s;
		s = x * y;
		System.out.println(s);
	}

	public static void div(int x, int y) {
		int s;
		s = x % y;
		System.out.println(s);
	}

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		add(x, y);
		sub(x, y);
		mul(x, y);
		div(x, y);
	}

}
