package Encapsulation;

public class Emp_Practice {
	private int id;
	private String name;
	private int salary;
	public void setId(int i)
	{
		this.id=i;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String s)
	{
		this.name=s;
	}
	public String getName()
	{
		return name;
	}
	public void setSalary(int a)
	{
		this.salary=a;
	}
	public int getSalary()
	{
		return salary;
	}
	public static void main(String args[])
	{
		Emp_Practice e=new Emp_Practice();
		e.setId(1);
		System.out.println("Employee ID="+e.getId());
		Emp_Practice e1=new Emp_Practice();
		e1.setName("Ram");
		System.out.println("Employee Name="+e1.getName());
		Emp_Practice e3=new Emp_Practice();
		e3.setSalary(100000);
		System.out.println("Employee Salary="+e3.getSalary());
	}

}
