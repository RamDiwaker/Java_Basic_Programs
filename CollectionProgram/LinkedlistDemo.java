package CollectionProgram;

import java.util.Iterator;
import java.util.LinkedList;


public class LinkedlistDemo {
	public static void main(String args[])
	{
		LinkedList<String> s=new LinkedList<>();
		s.add("LINKED");
		s.add("AAA");
		s.add("BBB");
		s.add("CCC");
		s.add("AAA");
		//s.remove();
		s.remove(0);
		Iterator<String> itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
