package TaskNo3;

public class Square extends Shape{
	public double side;
	public Square(double side)
	{
		this.side=side;
	}
	public void area()
	{
		double area=side*side;
		System.out.println("Square details");
		System.out.println("--------------");
		System.out.println("Side length: "+side);
		
		System.out.println("Area of the square is : "+area);
		
	}
	public void perimeter()
	{
		double perimeter=4*side;
		System.out.println("perimeter of the square is : "+perimeter);
		
	}
	

}
