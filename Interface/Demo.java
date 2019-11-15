package Interface;

public class Demo implements Hii,Printable
{
	@Override
	public void show()
	{
		System.out.println("Hiiii");
	}
	@Override
	public void print()
	{
		System.out.println("Hello");
	}
	@Override
	public void little()
	{
		System.out.println("Welcome");
	}
	
}
