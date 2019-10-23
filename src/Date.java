package com.classes;

public class Date {
	private int month, year;
	private String day;

	public Date()
    {
		setDay("monday");
   	 	setMonth(07);
   	 	setYear(2019);
   	 	System.out.println("Date->def....");
    }

	public Date(int month, int year, String day) {
		super();
		this.month = month;
		this.year = year;
		this.day = day;
		System.out.println("Date->def....");
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	@Override
	public String toString() {
		return "Day:"+day+"\t"+"Month:"+month+"\t"+"Year:"+year;
	}
	@Override
	public boolean equals(Object obj) {
       if(obj == null) return false;
       if(obj == this) return  false;
       if(! (obj instanceof Date)) return false;
       
       Date date = (Date) obj;
       
       if(date.day==this.day && date.month==this.month && date.year==this.year)
       {
    	   return true;
    	   
       }
       else 
    	   return false;
	}
	
	
}
