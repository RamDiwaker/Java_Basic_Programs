package ExceptionRuntime;

public class Throw 
{
	public void vote(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not Eligiable");
		}else
	{
		
		System.out.println("Eligiable");
	}

}
public static void main(String args[])
	{
		Throw t=new Throw ();
		t.vote(2);
	}
}