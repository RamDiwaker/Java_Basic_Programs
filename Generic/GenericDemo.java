package Generic;

public class GenericDemo<Student> {
	private Student t;

	public void add(Student t) {
	      this.t = t;
	   }

	   public Student get() {
	      return t;
	   }
	  
	   private Employee e;
	   public void emp(Employee e){
		   this.e=e;
	   }
	   public Employee retrive()
	   {
		   return e;
	   }

	
	

}
