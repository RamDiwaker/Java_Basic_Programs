package ExceptionRuntime;

import java.util.Scanner;

public class TrycatchDemo {
	public static void main(String args[])
	{
		System.out.println("Starting code");
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter Two No.");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c;
		System.out.println("Middle of the code");
		try
		{
			c=a/b;
			System.out.println("C="+c);
		}catch(ArithmeticException e)
		{
			
			System.out.println(e);
			System.out.println("Please Don't Enter Zero");
		}
		System.out.println("Ending the code");
		scan.close();
	}

}
