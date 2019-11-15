package Inheritance;

public class Studentcourse {
	public void cource()
	{
		System.out.println("Student select course\n");
	}

public class Science extends Studentcourse
{
	public void eng()
	{
		System.out.println("English"+"\t"+"Math\n");
		
	}
}
public class Arts extends Studentcourse
{
	public void music()
	{
		System.out.println("hindi"+"\t"+"Economics\n");
	}
}
public class Commers extends Studentcourse
{
	public void Account()
	{
		System.out.println("Management study"+"\t"+"Indian Economice\n");
	}
}
public static void main (String args[])
{
	Studentcourse s=new Studentcourse();
	s.cource();
	Science sc=s.new Science();
	sc.eng();
	Arts a=s.new Arts();
	a.music();
	Commers c=s.new Commers();
	c.Account();
}

}