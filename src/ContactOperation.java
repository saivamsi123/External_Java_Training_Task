package com.contactbook.collection;

public interface ContactOperation {
	public boolean addContact();
	public boolean deleteContact(String firstName);
	public Contact findContact(String firstName);
	public void listAll();
}
