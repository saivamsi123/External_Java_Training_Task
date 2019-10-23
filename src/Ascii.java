package com.basic;

public class Ascii {

	public static void main(String[] args) {
		for (int index = 0; index < 255; index++) {
			System.out.write(index);
			if (index % 8 == 7) {
				System.out.write('\n');
			} else {
				System.out.write('\t');
			}
		}

	}

}
