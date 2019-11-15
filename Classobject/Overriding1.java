package Classobject;

public class Overriding1 
{
	void fun()
	{
		System.out.println("Print Function A");
	}
}
	class Over extends Overriding1
	{
		void fun()
		{
			System.out.println("Print function B");
		}
	}
  class main1
	{
	public static void main(String args[])
	{
		System.out.println("Main Start");
		Over x=new Over();
		x.fun();
		System.out.println("Main Ends");
		
	
	}
}
