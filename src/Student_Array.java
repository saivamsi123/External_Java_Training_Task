package com.array;

import java.util.*;

import com.classes.Student;
import java.util.stream.IntStream;

public class Student_Array {
	static Scanner sc = new Scanner(System.in);
	static Student[] studs = new Student[3];

	public static void main(String[] args) {

		int ch, index;
		int toCheckValue = 0;
		while (true) {
			System.out.println("*****Options to be selected below******");
			System.out.print("1.Add \n");
			System.out.print("2.List All  \n");
			System.out.print("3.Delete\n");
			System.out.print("4.Find \n");
			System.out.print("5.Exit \n");
			System.out.print("Enter the choice: ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				addStudents();
				break;
			case 2:
				printList();
				break;
			case 3:
				System.out.println("Enter the index to be deleted:");
				index = sc.nextInt();
				studs = deleteStudents(index);
				printList();
				break;
			case 4:
				System.out.println("Enter the rollNo to be lookUp:");
				toCheckValue = sc.nextInt();
				find(studs, toCheckValue);
				break;
			default:
				System.out.println("This is not a valid Menu Option! Please Select Another");
				System.exit(0);
				break;
			}
		}
	}

	private static void addStudents() {
		Student student = new Student();
		for (int i = 0; i < studs.length; i++) {
			System.out.println("Enter the rollno:");
			int rollNo = sc.nextInt();
			student.setRollNo(rollNo);
			System.out.println("Enter the name:");
			String name = sc.next();
			student.setName(name);
			System.out.println("Enter the marks:");
			float marks = sc.nextFloat();
			student.setMarks(marks);
			studs[i] = new Student(student.getRollNo(), student.getName(), student.getMarks());
		}
		// printList(studs);
	}

	private static void printList() {
		System.out.println("******Printing all array values*******");
		for (int i = 0; i < studs.length; i++) {
			System.out.print(studs[i].getRollNo() + "\t");
			System.out.print(studs[i].getName() + "\t");
			System.out.print(studs[i].getMarks() + "\t" + "\n");
		}
	}

	private static Student[] deleteStudents(int index) {
		if (studs == null || index < 0 || index >= studs.length) {
			return studs;
		}
		// Create another array of size one less
		Student[] anotherStudentArray = new Student[studs.length - 1];

		// Copy the elements except the index
		// from original array to the other array
		for (int i = 0, k = 0; i < studs.length; i++) {

			// if the index is
			// the removal element index
			if (i == index) {
				continue;
			}
			// if the index is not
			// the removal element index
			anotherStudentArray[k++] = studs[i];
		}
		// return the resultant array
		return anotherStudentArray;
	}

	private static void find(Student[] studs, int toCheckValue) {
		// check if the specified element
		// is present in the array or not
		// using Linear Search method
		boolean test = false;
		for (Student element : studs) {
			if (element.getRollNo() == toCheckValue) {
				test = true;
				break;
			}
		}

		// Print the result
		System.out.println("Is " + toCheckValue + " present in the array: " + test);

	}
}
