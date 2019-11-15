package HomeAssignment;

import java.util.Scanner;

public class Question3 {
public static void main(String args[])
{
	int x,y,temp;
	System.out.println("Please Enter two no.\n");
	Scanner scan=new Scanner(System.in);
	x=scan.nextInt();
	y=scan.nextInt();
	System.out.println("Before Swapping\nx="+x+"\ny="+y);
	temp=x;
	x=y;
	y=temp;
	System.out.println("After Swapping\nx="+x+"\ny="+y);
	scan.close();
}
}
