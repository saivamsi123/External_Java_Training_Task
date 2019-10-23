package com.contactbook.collection;

import java.io.LineNumberInputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import com.contactbook.collection.*;
public class ContactOperationImplMain {
	static Scanner sc = new Scanner(System.in);
	static Contact contact = new Contact();
	static ContactOperationImpl_Arrays contactOperationImplArrays = new ContactOperationImpl_Arrays(3);
	static ContactOperation contactOperation = new ContactOperationImpl_Arrays(3);
	public static void main(String[] args) throws InputMismatchException
	{
		int ch = 0, index, count;
		String firstName = null;
		int toCheckValue = 0;
		while (true) {
			System.out.println("*****Options to be selected below******");
			System.out.print("1.Add Contacts \n");
			System.out.print("2.List All Contacts \n");
			System.out.print("3.Delete Contacts\n");
			System.out.print("4.Find Contacts\n");
			System.out.print("5.Exit \n");
			try {
				System.out.print("Select and enter the choice from above: ");
				ch = sc.nextInt();
//				System.out.print("How many Contacts you want to add: ");
//				count = sc.nextInt();
			}catch(InputMismatchException ime)
			{
				ime.printStackTrace();
			}
			
			switch (ch) {
			case 1:
				System.out.println("You are Inside Adding Contacts Area");
				contactOperationImplArrays.addContact();
				break;
			case 2:
				System.out.println("You are Inside See Contacts Area");
				contactOperationImplArrays.listAll();
				break;
			case 3:
				System.out.println("You are Inside Delete Contacts Area");
				System.out.println("Enter the firstName to be deleted:");
				firstName = sc.next();
//				boolean isDeleted = contactOperationImplArrays.deleteContact(firstName);
//				System.out.println("This is the data deleted: "+isDeleted);
				contactOperationImplArrays.contacts = contactOperationImplArrays.deleteContacts(firstName);
				contactOperationImplArrays.listAll(contactOperationImplArrays.contacts);
				//contactOperationImplArrays.listAll();
				break;
			case 4:
				System.out.println("You are Inside Find Contacts Area");
				System.out.println("Enter the firstName to be lookUp:");
				firstName = sc.next();
				contactOperationImplArrays.findContact(firstName);
				break;
			default:
				System.out.println("This is not a valid Menu Option! Please Select Another");
				System.exit(0);
				break;
			}
		}
	}
}
