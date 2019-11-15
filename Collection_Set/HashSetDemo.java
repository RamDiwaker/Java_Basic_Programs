package Collection_Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String args[]){  
		  //Creating HashSet and adding elements  
		    HashSet<Integer> s=new HashSet<>();  
		           s.add(1);    
		           s.add(2);    
		           s.add(3);   
		           s.add(4);  
		           s.add(5);  
		           Iterator<Integer> i=s.iterator();  
		           while(i.hasNext())  
		           {  
		           System.out.println(i.next());
		           }  
		 }  

}
