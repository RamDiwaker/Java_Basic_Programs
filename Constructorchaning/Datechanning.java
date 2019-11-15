package Constructorchaning;

public class Datechanning {
	private int day;
	private int month;
	private int year;
	public Datechanning()
	{
		day=2;
		month=10;
		year=2000;
	}
	public Datechanning(int d)
	{
		this();
		this.day=d;
	}
	public Datechanning(int d,int m)
	{
		this(d);
		this.month=m;
	}
	public Datechanning(int d,int m,int y)
	{
		this(d,m);
		this.year=y;
	}
	public void print()
	{
		System.out.println(day+"/"+month+"/"+year);
		System.out.println("\n");
	}
	public static void main(String args[])
	{
		Datechanning s=new Datechanning();
		Datechanning s1=new Datechanning(5);
		Datechanning s2=new Datechanning(6,10);
		Datechanning s3=new Datechanning(3,6,2019);
		s.print();
		s1.print();
		s2.print();
		s3.print();
	}
}
