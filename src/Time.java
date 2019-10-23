package com.classes;

public class Time {
	private int hour, minute, second;
	
	public Time()
	{
		setHour(23);
		setMinute(50);
		setSecond(59);
		System.out.println("Time->def....");
	}
	
	public Time(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		System.out.println("Time->def....");
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	@Override
	public String toString() {
		return "Hour:"+hour+"\t"+"Minute:"+minute+"\t"+"Second:"+second;
	}
	@Override
	public boolean equals(Object obj) {
       if(obj == null) return false;
       if(obj == this) return  false;
       if(! (obj instanceof Time)) return false;
       
       Time time = (Time) obj;
       
       if(time.hour==this.hour && time.minute==this.minute && time.second==this.second)
       {
    	   return true;
    	   
       }
       else 
    	   return false;
	}
	
	

}
