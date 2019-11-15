package Constructorchaning;

public class Empchanning {
	
		private int id;
		private String name;
		private int salary;
		public Empchanning()
		{
			id=2;
			name="VICKY";
			salary=40000;
		}
		public Empchanning(int i)
		{
			this();
			this.id=i;
		}
		public Empchanning(int i, String n)
		{
			this(i);
			this.name=n;
		}
		public Empchanning(int i,String n,int e)
		{
			this(i,n);
			this.salary=e;
		}
		public void print()
		{

		System.out.println("Emp id="+id+"\n"+"Emp Name="+name+"\n"+"Emp Salary"+salary);
			System.out.println();
			
		}
		public static void main(String args[])
		{
			Empchanning s=new Empchanning();
			s.print();
			Empchanning s1=new Empchanning(100);
			s1.print();
			Empchanning s2=new Empchanning(200,"RAM");
			s2.print();
			Empchanning s3=new Empchanning(300,"RVVICKY",50000);
			s3.print();
		}
	}

