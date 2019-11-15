package Generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestGen {
	public static void main(String args[])
	{
		Student s=new Student(111,"RAM",80);
		Student s1=new Student(222,"VICKY",70);
		Student s2=new Student(333,"KUMAR",90);
		GenericDemo<Student> i=new GenericDemo<Student>();
		i.add(s);
		System.out.println(i.get());
		List<Student> l=new ArrayList<>();
		l.add(s1);
		l.add(s2);
		Iterator<Student> itr=l.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("\n");
		Employee e1=new Employee(1,"RVVICKY",50000.00);
		Employee e2=new Employee(2,"Amit",40000.00);
		GenericDemo<Employee> j=new GenericDemo<Employee>();
		j.add(e1);
		System.out.println(j.get());
		List<Employee> l1=new ArrayList<>();
		l1.add(e2);
		Iterator<Employee> itr1=l1.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		
	}
}
