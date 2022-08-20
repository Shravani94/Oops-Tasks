package TaskNo3;

public class Triangle extends Shape {
	public Triangle(double length, double breadth, double height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	public double length;
	public double breadth;
	public double height;
	
	public void area()
	{
		double area=0.5*height*breadth;
		System.out.println("Triangle details");
		System.out.println("--------------");
		System.out.println("Side length: "+length);
		System.out.println("Side height: "+height);
		System.out.println("Side breadth: "+breadth);
		System.out.println("Area of the triangle is : "+area);
	
	}
	public void perimeter()
	{
		double perimeter=length+height+breadth;
		System.out.println("perimrter of the triangle is : "+perimeter);
		
		
	}
	
	}
