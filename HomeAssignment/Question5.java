package HomeAssignment;

import java.util.Scanner;

public class Question5 {
	public static void main(String args[])

	{
		
		System.out.println("Enter any Number");
		Scanner scan=new Scanner(System.in);
		
		int x=scan.nextInt();
		if(x%3==0)
		{
			if(x%5==0)
			{
				System.out.println("Number is Divisible");
			}
			
		}
		else
		{
			System.out.println("Number is Not Divisible");
		}
		scan.close();
	}
}
