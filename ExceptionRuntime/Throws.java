package ExceptionRuntime;

public class Throws {

	public void vote(int age)
	{
		if(age<18)
		{
			try
			{
				throw new Noteligiable();
			}catch(Noteligiable e)
			{
				e.printStackTrace();
			}
			//System.out.println("Not Eligiable");
		}
		else
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