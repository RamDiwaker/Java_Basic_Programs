package HomeAssignment;

public class Question15 {

	public static void main(String[] args) {
		
			System.out.println("Starting code");
			String name="abc";
			System.out.println("Middle of the code");
			
			try{
				int a=Integer.parseInt(name);
				System.out.println(name);
			}catch(NumberFormatException e)
			{
				System.out.println(e);
				System.out.println("Enter numeric value");
			}
			System.out.println("Ending of the code");

	}

}
