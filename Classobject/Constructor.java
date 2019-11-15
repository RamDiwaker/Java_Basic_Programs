package Classobject;

public class Constructor {
	private int rollNo;
	private String name;
	private double marks;
	public Constructor()
	{
		rollNo=101;
		name="RAM";
		marks=80;
	}
	public void printData()
	{
		System.out.println(rollNo+name+marks);
	}
	public Constructor(int r,String n, double m)
	{
		rollNo=r;
		name=n;
		marks=m;
	}
	public static void main(String args[])
	{
		Constructor c=new Constructor();
		c.printData();
		Constructor c1=new Constructor(1,"vicky",70);
		c1.printData();
	}

}
