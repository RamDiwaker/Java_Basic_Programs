package Final;

public class Final1 {
	private int a=5;
	private final int b=1;
	
	public void Fun()
	{
		// b=10;//Cannot initilize again
		System.out.println(a+" "+b);
	}
	public static void main(String args[])
	{
		Final1 f=new Final1();
		f.Fun();
	}

}
