package HomeAssignment;

import java.util.Scanner;

public class Question4 {
	public static void main (String args[])
	{
		double r,area;
		double perimeter;
		float x;
		System.out.println("Enter a No.");
		Scanner scan=new Scanner(System.in);
		r=scan.nextDouble();
		x=scan.nextFloat();
		
		area=3.14*r*r;
		System.out.println("Area="+area);
		System.out.println("\n");
		perimeter=2*3.14*x;
		
		System.out.println("Perimeter="+perimeter);
		scan.close();
	}

}
