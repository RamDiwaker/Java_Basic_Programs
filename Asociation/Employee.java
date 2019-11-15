package Asociation;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private Date djoining;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, double salary,Date djoining) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.djoining=djoining;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", djoining=" + djoining + "]";
	}
	
	

}
