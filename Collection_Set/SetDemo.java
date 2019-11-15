package Collection_Set;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class SetDemo {
	public static void main(String args[])
	{
		LinkedHashSet<Integer> l=new LinkedHashSet<>();
		l.add(2);
		l.add(3);
		l.add(4);
		l.remove(0);
		Iterator<Integer> itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("............");
		LinkedHashSet<Integer> l1=new LinkedHashSet<>();
		l1.add(10);
		l1.addAll(l);
		Iterator<Integer> itr1=l1.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		
	}

}
