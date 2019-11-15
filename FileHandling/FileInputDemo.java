package FileHandling;

import java.io.FileInputStream;

public class FileInputDemo 
{
	public static void main(String args[])
	{
	try
	{
		FileInputStream in=new FileInputStream("E://demo.txt");
		int a=in.read();
		System.out.println((char)a);
		int x=0;
		while((x=in.read())!=-1)
		{
			System.out.print((char)x);
		}
}
	catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	}
	
}