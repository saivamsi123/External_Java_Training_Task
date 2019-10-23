package com.contactbook.collection;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ContactOperationImpl_Arrays implements ContactOperation {
	static Scanner sc = new Scanner(System.in);
	static Contact[] contacts;
	static int index;

	public ContactOperationImpl_Arrays(int size) {
		super();
		contacts = new Contact[size];
	}

	@Override
	public boolean addContact() throws ArrayIndexOutOfBoundsException, ArithmeticException, InputMismatchException{
		Contact contactConstruct = new Contact();
		try
		{
			for (int index = 0; index < 3; index++) {
				System.out.println("Enter the firstName:");
				String firstName = sc.next();
				contactConstruct.setFirstName(firstName);
				System.out.println("Enter the lastName:");
				String lastName = sc.next();
				contactConstruct.setLastName(lastName);
				System.out.println("Enter the Email:");
				String email = sc.next();
				contactConstruct.setEmail(email);
				System.out.println("Enter the PhoneNo:");
				String phoneNo = sc.next();
				contactConstruct.setPhoneNo(phoneNo);
				contacts[index] = new Contact(contactConstruct.getFirstName(), 
						contactConstruct.getLastName(),contactConstruct.getEmail(), contactConstruct.getPhoneNo());
					
		}
		}
		catch(ArithmeticException arte)
		{
			arte.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			aie.printStackTrace();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return false;
	}
	@Override
	public boolean deleteContact(String firstName) {
		boolean isDeleted = false;
		Contact[] contact1 = deleteContacts(firstName);
		int count = ArrayListElements(contact1);
		System.out.println("Contacts array length:" + contacts.length);
		if (count < contacts.length) {
			isDeleted = true;
			return isDeleted;
		}
		return false;
	}

	public static int ArrayListElements(Contact[] contact1) {
		for (int index = 0; index < contact1.length; index++) {
			System.out.println("Inside array elements count");
		}
		return index;
	}

	public static Contact[] deleteContacts(String firstName) {
		String optionYesOrNo = "";
		if (contacts == null || index < 0 || index >= contacts.length) {
			return contacts;
		}
		Contact[] anotherContactArray = new Contact[contacts.length - 1];
		try {
			for (int i = 0, k = 0; i < contacts.length; i++) {
				if (contacts[i].getFirstName().equals(firstName)) {
					System.out.println("This is the element data you want to delete: " + contacts[i].getFirstName() + "\t"
							+ contacts[i].getLastName() + "\t" + contacts[i].getEmail() + "\t" + contacts[i].getPhoneNo());
					System.out.println("Would you like to confirm by clicking yes or no:");
					String yes = "yes";
					String no = "no";
					optionYesOrNo = sc.next();
					if (optionYesOrNo.equalsIgnoreCase(yes)) {
						continue;
					} else {
						System.exit(0);
					}
				}
				anotherContactArray[k++] = contacts[i];
			}
		}
		catch(ArithmeticException arte)
		{
			arte.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			aie.printStackTrace();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
		return anotherContactArray;
	}

	@Override
	public Contact findContact(String firstName) {
		boolean test = false;
		for (Contact element : contacts) {
			if (element.getFirstName().equals(firstName)) {
				test = true;
				break;
			}
		}

		// Print the result
		System.out.println("Is " + firstName + " present in the array: " + test);

		return null;
	}

	public static void listAll(Contact[] contacts) {
		System.out.println("******Printing all Contacts*******");
		for (int index = 0; index < contacts.length; index++) {
			System.out.print(contacts[index].getFirstName() + "\t");
			System.out.print(contacts[index].getLastName() + "\t");
			System.out.print(contacts[index].getEmail() + "\t");
			System.out.print(contacts[index].getPhoneNo() + "\t" + "\n");
		}
	}

	@Override
	public void listAll() {
		System.out.println("******Printing all Contacts*******");
		for (int index = 0; index < contacts.length; index++) {
			System.out.print(contacts[index].getFirstName() + "\t");
			System.out.print(contacts[index].getLastName() + "\t");
			System.out.print(contacts[index].getEmail() + "\t");
			System.out.print(contacts[index].getPhoneNo() + "\t" + "\n");
		}
	}

}
