package Classobject;

public class Calculator {
	public int s;
public void getValue(int x, int y)
{
	s=x+y;
	System.out.println("SUM="+s);
}

public void sub(int x, int y)
{
	s=x-y;
	System.out.println("Sub="+s);
}

public void mul(int x, int y)
{
	s=x*y;
	System.out.println("Mul="+s);
}

public static void main(String args[])
{
	Calculator c=new Calculator();
	c.getValue(2, 3);
	
	Calculator c1=new Calculator();
	c1.sub(15, 5);
	
	Calculator c2=new Calculator();
	c2.mul(5,5);
	
}
}
