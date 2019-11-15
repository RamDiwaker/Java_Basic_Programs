package CollectionProgram;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
	public static void main(String args[])
	{
		Queue<String> s=new PriorityQueue<>();
		s.add("AAA");
		s.add("bbb");
		s.add("cc");
		s.add("AAA");
		s.remove("AAA");
		Iterator<String> itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
