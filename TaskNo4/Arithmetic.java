package TaskNo4;

public class Arithmetic implements Test {
	public int side;
	public Arithmetic(int side)
	{
		this.side=side;
	}
	public void square()
	{
		int area=side*side;
		int perimeter=4*side;
		System.out.println("Area of square "+area);
		System.out.println("perimeter of square "+perimeter);
		}

}
