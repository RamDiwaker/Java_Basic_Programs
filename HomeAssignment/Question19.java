package HomeAssignment;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Question19 {
	
		public static void main(String args[])
		{
			LinkedHashSet<String> l=new LinkedHashSet<>();
			l.add("Red");
			l.add("Yellow");
			l.add("Green");
			l.add("Pink");
			l.add("Blue");
			Iterator<String> itr=l.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			System.out.println("............");
		}

	}
