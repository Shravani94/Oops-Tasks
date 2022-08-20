package TaskNo5;

public class Box {
	
	public double length;
	public double breadth;
	public double height;
	
	public Box(double length, double breadth, double height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
		
	}
	
	public void area()
	{
		double area=0.5*height*breadth;
		System.out.println("Triangle details");
		System.out.println("--------------");
		System.out.println("Side length: "+length);
		System.out.println("Side height: "+height);
		System.out.println("Side breadth: "+breadth);
		System.out.println("Area of the   is : "+area);
	
	}
	public void volume()
	{
		double volume=0.5*height*breadth*length;
		System.out.println("volume of  is : "+volume);
		
	}
	

}
