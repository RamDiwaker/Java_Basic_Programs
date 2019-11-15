package Generic;

public class Student {
	 private int roll;
	 private String name;
	 private int marks;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Student Detail  = "+roll+" "+name+" "+marks;
	}
	 
	 public Student(int roll, String name, int marks) 
	 {
		// super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	 }
	
}
