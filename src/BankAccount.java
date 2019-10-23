package com.classes;

public class BankAccount {

	private int acctId;
	private String acctName;
	private float balance;
	 
	public BankAccount() {
		super();
		this.acctId = 0;
		this.acctName = "Axis";
		this.balance = 0;
		System.out.println("BankAccount->def...");
	}
	
	public BankAccount(int acctId, String acctName, float balance) {
		super();
		this.acctId = acctId;
		this.acctName = acctName;
		this.balance = balance;
	}

	public int getAcctId() {
		return acctId;
	}

	public void setAcctId(int acctId) {
		this.acctId = acctId;
	}

	public String getAcctName() {
		return acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(double otherBalance) {
		this.balance = (float) otherBalance;
	}

	@Override
	public String toString() {
		return "BankAccount [acctId=" + acctId + ", acctName=" + acctName + ", balance=" + balance + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(obj == this) return false;
		if(!(obj instanceof BankAccount)) return false;
		
		BankAccount otherAccount = (BankAccount) obj;
		if(acctId == otherAccount.getAcctId() && acctName.equals(otherAccount.getAcctName()) && balance == otherAccount.getBalance())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void deposit(double amount)
	{
		if(amount>1000)
		{
			balance += amount;
		}
	}
	
	public void withdraw(double amount)
	{
		if(amount>1000)
		{
			balance -= amount;
		}
	}
	
	public void transfer(double amount, BankAccount otherBankAccount)
	{
		if(amount>1000)
		{
			balance -= amount;
			double otherBalance = otherBankAccount.getBalance();
			otherBalance += amount;
			otherBankAccount.setBalance(otherBalance);
		}
	}
	
	public static void transferTo(BankAccount Account, BankAccount otherBankAccount)
	{
		
	}
	
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount(101,"Amar", 5000);
		BankAccount account2 = new BankAccount(102,"Akbar", 9000);
		account1.transfer(1000, account2);
		System.out.println(account1);
		System.out.println(account2);
		
		BankAccount.transferTo(account1, account2);
	}

}
