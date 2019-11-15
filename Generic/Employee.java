package Generic;

public class Employee {
	private int id;
	private String name;
	private double salary;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee Detail  = "+id+" "+name+" "+salary;
	}
	public Employee(int i, String n, double s) {
		super();
		this.id = i;
		this.name = n;
		this.salary = s;
	}

}
