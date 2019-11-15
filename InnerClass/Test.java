package InnerClass;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o=new Outer();
		o.outerMethod();
		Outer.inner in=o.new inner();
		in.innerMethod();

		System.out.println("..................");
		LocalOuter l=new LocalOuter();
		l.outerLocal();
		System.out.println("..................");
		Printable p=new Printable()
				{
				@Override
				public void print()
				{
					System.out.println("Hiiiiiiiiiiiii");
				}
				};
		p.print();
		
		//Anamolies class
		Demo d =new Demo()
				{

					@Override
					public void hello() {
						System.out.println("Abstract Class test");
						
					}
				};
				d.hello();
	}

}
