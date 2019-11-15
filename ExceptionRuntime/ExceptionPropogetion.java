package ExceptionRuntime;

public class ExceptionPropogetion {
	public void add()
	{
		System.out.println("Start Add");
		System.out.println("End Add");
	}
	public void sub()
	{
		System.out.println("Start sub");
		add();
		System.out.println("End sub");
	}
	public void mul()
	{
		System.out.println("Start mul");
		try
		{
		sub();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("End mul");
	}
	public static void main(String args[])
	{
		ExceptionPropogetion e1=new ExceptionPropogetion();
		e1.mul();
	}

}
