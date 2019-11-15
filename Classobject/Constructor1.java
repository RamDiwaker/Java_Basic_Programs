package Classobject;

public class Constructor1 {

double radious;
Constructor1(double r)
{
	radious=r;
	double a=3.14*r*r;
	System.out.println("Area="+a);
}
public static void main(String args[])
{
	Constructor1 c1=new Constructor1(2);
}

}
