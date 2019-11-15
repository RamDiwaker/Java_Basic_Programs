package HomeAssignment;

public class Employee {
	private int emp_id;
	private String emp_name;
	private double salary;	
	public Employee()
	{
		
	}
	public Employee(int r,String n,double s)
	{
		this.emp_id=r;
		this.emp_name=n;
		this.salary=s;
	}
	public void getDetails() 
		// TODO Auto-generated method stub
		{
			//System.out.println("Employee Details");
			System.out.println("Employee ID=\t"+emp_id);
			System.out.println("Employee Name=\t"+emp_name);
			System.out.println("Employee Salary=\t"+salary);
		}
		
	
	  
}
                                                   