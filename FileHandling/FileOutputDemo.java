package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo {
	public static void main(String args[]) throws IOException
	{
	FileOutputStream out= new FileOutputStream("E://demo.txt");
	
	out.write(65);
	String name="hello";
	byte aa[]=name.getBytes();
	out.write(aa);
	System.out.println("Done");
	out.close();
}
}