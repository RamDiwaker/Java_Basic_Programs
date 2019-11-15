package ExceptionRuntime;

public class TryNested {
	public static void main(String args[])
	{
		try {
			
			try {
				int c=10/0;
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
			try {
				String name="ram";
				int i=Integer.parseInt(name);
				String d=null;
				System.out.println(d.length());
				
			} catch (NullPointerException e) {
				System.out.println(e);
			}	
			
		} catch (Exception e) {
			
			System.out.println(e);

		}
		System.out.println("Ending");
		
	}
		
}
