package com.classes;

/**
 * @author Allianz3075
 *
 */
public class Student {

	// fields....
	private int rollNo;
	private String name;
	private float marks;

	// contructors....
	public Student() {
		setRollNo(0);
		setName(null);
		setMarks(0.0f);
		//System.out.println("Student->def....");
	}

	public Student(int prollNo, String pname, float pmarks) {
		setRollNo(prollNo);
		setName(pname);
		setMarks(pmarks);
		//System.out.println("Student->param....");
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public float getMarks() {
		return marks;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "RollNo:" + rollNo + "\t" + "Name:" + "\t" + name + "\t" + "Marks:" + marks;
	}
	@Override
	public boolean equals(Object obj) {
       if(obj == null) return false;
       if(obj == this) return  false;
       if(! (obj instanceof Student)) return false;
       
       Student otherStudent = (Student) obj;
       
       if(otherStudent.rollNo==this.rollNo && otherStudent.name==this.name && otherStudent.marks==this.marks)
       {
    	   return true;
    	   
       }
       else 
    	   return false;
       
    	   
	
	}

	public static void main(String args[]) {
		Student s1, s2;
		s1 = new Student();
		s1.setRollNo(100);
		s1.setName("rajani");
		s1.setMarks(76.09f);
		s2 = new Student(100, "rajani", 76.09f);
		System.out.println(s1);
		System.out.println(s2.toString());
		if (s1 == s2)

			System.out.println("s1 is equals to s2");

		else
			System.out.println("s1 is not equals to s2");
		
		if (s1.equals(s2))

			System.out.println("s1 is equals to s2");

		else
			System.out.println("s1 is not equals to s2");
		System.out.println(s1.getClass().getName() + '@' + Integer.toHexString(s1.hashCode()));

	}
}
