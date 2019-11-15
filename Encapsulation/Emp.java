package Encapsulation;

public class Emp {
private int id;
private String name;
private double salary;
public void setId(int i)
{
	this.id=i;

}
public int getId()
{
	return id;
}
public void setName(String j)
{
	this.name=j;

}
public String getName()
{
	return name;
}
public void setSalary(double k)
{
	this.salary=k;

}
public double getSalary()
{
	return salary;
}

public static void main(String args[])
{
	Emp e=new Emp();
	e.setId(4);
	System.out.println("Value is="+e.getId());
	Emp e1=new Emp();
	e1.setName("RAM");
	System.out.println("Emp Name is="+e1.getName());
	Emp e2=new Emp();
	e2.setSalary(70000);
	System.out.println("Emp Name is="+e2.getSalary());
}

}
