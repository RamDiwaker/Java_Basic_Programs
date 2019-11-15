package Classobject;

public class Overloading1 {
	static void area(int side)
	{
		int a=side*side;
		System.out.println("Area of Square="+a);
	}
	static void area(int length,int breadth)
	{
		int a=length*breadth;
		System.out.println("Area of Rectangle="+a);
	}
	void area(double radious)
	{
		double d=3.14*radious*radious;
		System.out.println("Area of Circle="+d);
	}
	public static void main(String args[])
	{
		area(2);
		area(3,5);
		Overloading1 o=new Overloading1();
		o.area(3.0);
	}

}
