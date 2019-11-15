package MapProgram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmapdemo {
public static void main(String args[])
{
	Map<Integer, String> m=new HashMap<>();
	m.put(1, "AAA");
	m.put(3, "BBB");
	m.put(5, "CCCC");
	m.put(1, "AAA");
	m.put(5, "QQQ");
	Set<Entry<Integer, String> >s=m.entrySet();
	Iterator<Entry<Integer, String>> itr=s.iterator();
	/*while(itr.hasNext())
	{
		System.out.println(itr.next());
	}*/
	while(itr.hasNext())
	{
		Map.Entry<Integer, String>me=(Entry<Integer, String>)itr.next();
		System.out.println(me.getKey()+"===="+me.getValue());
	}
}

}
