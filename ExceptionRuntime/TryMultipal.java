package ExceptionRuntime;

public class TryMultipal {
	public static void main(String args[])
	{
		System.out.println("Starting");
		try
		{
			int c=10/0;
			String name="ram";
					int i=Integer.parseInt(name);
					String d=null;
					System.out.println(d.length());
		}catch(NullPointerException e)
		{
			System.out.println(e);
		}catch(ArithmeticException e)
		{
			System.out.println(e);
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Ending");
	}

}
