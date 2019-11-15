package HomeAssignment;

public class Question7 {
		public static void main(String [] args)
		{
			int a=12521,b=0,c,d;
			d=a;
			while(a!=0)
			{
				c=a%10;
				b=b*10+c;
				a/=10;
			}
			if(d==b)
			System.out.print(d + " is a palindrome ");
			else
			System.out.print(d + " is not paliundrome1");	
		}
	}
