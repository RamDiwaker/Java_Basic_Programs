package Inheritance;

public class Student {
	private int roll;
	private String name;
	private String course ="XYZ";
	public Student()
	{
		System.out.println("Student Detail");
	}
		
	public Student(int r,String n)
	{
		this.roll=r;
		this.name=n;
	}
	public void printData() 
		// TODO Auto-generated method stub
		{
			System.out.println(roll);
			System.out.println(name);
			System.out.println(course);
		}
		
	
	  
}
                                                   