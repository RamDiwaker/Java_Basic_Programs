package HomeAssignment;

public class Queston8 
{
	public static void main(String args[])
	{
		int f1=0,f2=1,i,f3,count=10;
		System.out.println(f1+"\n"+f2);
		for(i=2;i<count;i++)
		{
			f3=f1+f2;
			System.out.println(f3);
			f1=f2;
			f2=f3;
		}
		
	}

}
