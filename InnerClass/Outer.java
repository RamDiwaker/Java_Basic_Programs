package InnerClass;

public class Outer {
	private int a=5;
	public void outerMethod()
	{
		System.out.println("A="+a);
	}
	class inner
	{
		private int b=6;
		public void innerMethod() {
			// TODO Auto-generated method stub
			System.out.println("A="+a);
			System.out.println("B="+b);
		}
	}

}
