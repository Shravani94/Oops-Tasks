package TaskNo3;

public class MainClass {
	public static void getObject(Shape shape)
	{
		shape.area();
		shape.perimeter();
		System.out.println();
		
	}
	public static void main (String[] args)
	{
		Circle circle=new Circle(20);
		getObject(circle);
		Triangle triAngle=new Triangle(20.5,30.7,40.4);
		getObject(triAngle);
		Square square=new Square(20);
		getObject(square);
	}

}
