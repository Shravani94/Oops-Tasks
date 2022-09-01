package cj4programs;

public class multilevel {
	public void assessemet()
	{
		System.out.println("take assessment");
		
	}

}
class single extends multilevel
{
	public void tr()
	{
		System.out.println("attend tr round");
	}
	
}
class mainclass extends single
{
	public static void hr()
	{
		System.out.println("attend hr round");
	}
	public static void main(String[] args)
	{
		mainclass m1=new mainclass();
		m1.assessemet();
		m1.tr();
		m1.hr();
	}
}
