package com.classes;

public class DateTime {
	private  Date date;
	private  Time time;
	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Time getTime() {
		return time;
	}


	public void setTime(Time time) {
		this.time = time;
	}
	
	public DateTime()
	{
		date = new Date();
		time = new Time();
	}
	
	public DateTime(Date date, Time time) {
		this.date = date;
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "Date:"+date.toString()+"\t"+"Time:"+time.toString();
	}
	@Override
	public boolean equals(Object obj) {
       if(obj == null) return false;
       if(obj == this) return  false;
       if(! (obj instanceof Date)) return false;
       
       DateTime dateTime = (DateTime) obj;
       
       return date.equals(dateTime.getDate()) && time.equals(dateTime.getTime());
	}
	
	
	public static void main(String args[]) {
		Date date = new Date();
		Time time = new Time();
		
		DateTime dateTime1 = new DateTime(date, time);
		DateTime dateTime2 = new DateTime(date, time);
		
		if(dateTime1.equals(dateTime2))
		{
			System.out.print("DateTime1 equals DateTime2");
		}
		else
		{
			System.out.print("DateTime1 not equals DateTime2");
		}
	}
}
