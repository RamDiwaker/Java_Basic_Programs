package HomeAssignment;

public class Question9 {
	private int height;
	private int width;
	private int depth;
	public Question9(int height, int width, int depth)
	{
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	private void Question9()
	{
		int volume=height*width*depth;
		System.out.println("Volume="+volume);
	}
	public static void main(String args[])
	{
		Question9 q=new Question9(2,3,4);
		q.Question9();
	}

}
