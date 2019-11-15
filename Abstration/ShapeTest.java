package Abstration;

public class ShapeTest {
	public static void main(String[] args) {
		Shape s=new Circle(2);
		s.area();
		s.print();
		Shape s1=new Rectangle(2,3);
		s1.area();
		s1.print();
		Shape s2=new Square(5);
		s2.area();
		s2.print();
		
	}

	

}
