package HomeAssignment;

public class Manager extends Employee {
	private int dept_id;
	private String dept_name;
	
	
	public  Manager(int r,String n,double s)
	{
		super(r,n,s);
	}
	public Manager(int di,String dn)
	{
		this.dept_id=di;
		this.dept_name=dn;
	}
	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		super.getDetails();
		System.out.println("");
	}
	public void showDetsails()
	{
		System.out.println("Department id=\t"+dept_id);
		System.out.println("Department name=\t"+dept_name);
	}
}
