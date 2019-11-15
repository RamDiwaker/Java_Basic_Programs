package ExceptionRuntime;

public class Finally {
	public static void main(String args[])
	{
		System.out.println("Starting");
		try
		{
			int c=10/0;
			System.out.println(c);
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}finally
		{
			
			System.out.println("Finally block");
			System.exit(1);
		}
		System.out.println("Ending");
		
	}
	
	

}
