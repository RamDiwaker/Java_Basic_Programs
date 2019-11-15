package CollectionProgram;

import java.util.Iterator;

import java.util.Vector;

public class VectorDemo {
	public static void main(String args[])
	{
		Vector<Integer> s=new Vector<>();
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(2);
		s.remove(1);
		Iterator<Integer> itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
}
