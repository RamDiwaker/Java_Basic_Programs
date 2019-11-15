package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectPass {
	private static int n;

	public static void main (String args[])
	{
		Student student=new Student(11, "RAM", 85);
		try
		{
			FileOutputStream o=new FileOutputStream("E://demo.txt");
			ObjectOutputStream obj=new ObjectOutputStream(o);
			obj.writeObject(o);
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		FileInputStream in=new FileInputStream("E://demo.txt");
		System.out.println("Student Name"+"\t"+"Roll"+"\t\t"+"Marks");
        System.out.println("======================================");
       
}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
