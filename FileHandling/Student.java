package FileHandling;

public class Student {
	private int roll;
	private String name;
	private int marks;
	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString()
	{
		return this.roll+"\n"+this.name+"\n"+this.marks;
	}
	
	  
}
