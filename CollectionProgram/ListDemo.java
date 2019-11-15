package CollectionProgram;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
public static void main(String args[])
{
	ArrayList <Integer>l1=new ArrayList();
	l1.add(3);
	l1.add(4);
	l1.add(5);
	l1.add(8);
	l1.add(9);
	l1.add(3);
	l1.remove(1);
	
	//l1.size(ArrayList<Integer>);
	System.out.println(l1.hashCode());

	l1.get(2);
	System.out.println();

	
	
	l1.add(3,5);
	//l1.clear();
	
	System.out.println("...............");
	System.out.println(l1.isEmpty());
	System.out.println("...............");

	System.out.println(l1.size());
	Iterator<Integer> itr=l1.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
