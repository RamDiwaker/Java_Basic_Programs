package LamdaExpression;

import LamdaExpe1.Return;

public class Test {

	public static void main(String[] args) {
		Printable p=()->{
			System.out.println("Helloooo");
		};
		
		
		Return r=(a)->{
			return "Java"+a;
			
		};	
		System.out.println(r.show(5));
		Add a=(x,y)->
				{
					System.out.println("Add="+(x+y));
				};
				a.show(2,2);
				
				
				
	}

}
