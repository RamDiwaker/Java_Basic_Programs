package Classobject;

public class Algebra {
int x;
int y;
Algebra(int a, int b)
{
	x=a;
	y=b;
	int z=x^2+2*a*b+b;
	System.out.println("Value is="+z);
}
public static void main(String args[])
{
	Algebra a=new Algebra(2,3);
}
}
