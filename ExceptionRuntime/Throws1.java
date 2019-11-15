package ExceptionRuntime;

public class Throws1 {
	public void vote(int age)throws ArithmeticException
	{
		if(age<18)
		{
			System.out.println ("Not Eligiable");
		}else
	{
		
		System.out.println("Eligiable");
	}

}
public static void main(String args[])
	{
		Throw t=new Throw ();
		t.vote(19);
	}
}
