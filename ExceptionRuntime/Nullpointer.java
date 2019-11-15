package ExceptionRuntime;

public class Nullpointer {
	public static void main(String args[])
	{
		System.out.println("Starting code");
		String name=null;
		System.out.println("Middle of the code");
		
		try{
			System.out.println(name.length());
		}catch(NullPointerException e)
		{
			System.out.println(e);
			System.out.println("Assign value");
		}
		System.out.println("Ending of the code");
	}

}
