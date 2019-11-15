package CollectionProgram;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
public static void main(String args[])
{
	Stack<String> s=new Stack<>();
	s.push("AA");
	s.push("BB");
	s.push("cc");
	s.push("dd");
	s.push("ee");
	s.pop();
	System.out.println(s.pop());//Iterate and remove the value
	System.out.println(".........");
	System.out.println(s.peek());//only Iterate
	System.out.println(".........");
	Iterator<String> itr=s.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
