package TaskNo3;

public class Circle extends Shape{
	public static double pi=3.14;
	public double radius;
	public Circle(double radius )
	{
		this.radius=radius;
	}
	public void area()
	{
		double area=pi*radius*radius;

		System.out.println("Circle details");
		System.out.println("--------------");
		System.out.println("Side length: "+area);
		
		
	}
	public void perimeter()
	{
		double perimeter=2*pi*radius;
		System.out.println("perimeter of the cicle is :"+perimeter);
		
	}
	

}
