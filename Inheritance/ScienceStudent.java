package Inheritance;

public class ScienceStudent extends Student {
	private String sub2="Math";
	public  ScienceStudent()
	{
		System.out.println("Student Detail");
	}
		
	public  ScienceStudent(int r,String n)
	{
		super(r,n);
	}
	@Override
	public void printData()
	{
		super.printData();
		System.out.println(sub2);
	}

}
