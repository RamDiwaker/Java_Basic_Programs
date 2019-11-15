package ExceptionRuntime;



public class Divison {
	public  int a=10;
	public int b=0;
	
	public void Divide()
	{
	try
	{
	int	c=a/b;
		System.out.println("C="+c);
	}catch(ArithmeticException e)
	{
		
		System.out.println(e);
		System.out.println("Please Don't Enter Zero");
	}
	System.out.println("Ending the code");
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	Divison d=new Divison();
	d.Divide();
	
}
}
