package Abstration;

public abstract  class Shape {
	protected float val1;
	protected float val2;
	protected double area ;


	public Shape()
	{
		val1=1;
		val2=1;
	}
	public Shape(int d1)
	{
		this();
		this.val1=d1;
	}
	
		
	public  Shape(int d1,int d2)
	{
		this(d1);
		this.val1=d2;
		
		
	}
	public  Shape(int d1,int d2,int d3)
	{
		this(d1,d2);
		this.val1=d3;
	}
	abstract public  void  area();
	
	
	public void print()
	{
		System.out.println("Area="+area);	
	}
	
	
	

}
