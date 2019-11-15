package HomeAssignment;

import java.util.Scanner;

public class Question6 {
public static void main(String args[])
{
	int c=0,n,a,temp;
	System.out.println("Enter a Number");
	Scanner scan=new Scanner(System.in);
	n=scan.nextInt();
	temp=n;
	while(n>0)
	{
		a=n%10;
		n=n/10;
		c=c+(a*a*a);
		
	}
	if(temp==c)
		System.out.println("Amstrong Number");
	else
		System.out.println("Not a Amstrong Number");
	scan.close();
}
}
