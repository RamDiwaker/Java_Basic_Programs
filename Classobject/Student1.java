package Classobject;

public class Student1 {
	String name;
	int id;
	int marks;
	Student1(String n,int i,int m)
	{
		name=n;
		id=i;
		marks=m;
	}
	Student1(String n, int i)
	{
		name=n;
		id=i;
	}
	public static void main(String args[])
	{
		Student1 s=new Student1("Ram",1,80);
		System.out.println("Student Name="+s.name);
		System.out.println("Student Name="+s.id);
		System.out.println("Student Name="+s.marks);
		Student1 s1=new Student1("Vicky",2);
		System.out.println("Student Name="+s1.name);
		System.out.println("Student Name="+s1.id);
		
	}

}
