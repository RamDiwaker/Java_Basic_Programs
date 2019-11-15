package Encapsulation;

public class Studetail {

	private int rollno;
	private String name;
	private int marks;
	public void setRoll(int i)
	{
		this.rollno=i;

	}
	public int getRoll()
	{
		return rollno;
	}
	public void setName(String j)
	{
		this.name=j;

	}
	public String getName()
	{
		return name;
	}
	public void setMarks(int k)
	{
		this.marks=k;

	}
	public int getMarks()
	{
		return marks;
	}

	public static void main(String args[])
	{
		Studetail e=new Studetail();
		e.setRoll(4);
		System.out.println("Student roll="+e.getRoll());
		Studetail e1=new Studetail();
		e1.setName("RAM");
		System.out.println("Student Name="+e1.getName());
		Studetail e2=new Studetail();
		e2.setMarks(80);
		System.out.println("Student Marks="+e2.getMarks());
	}

	}

