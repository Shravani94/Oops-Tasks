package TaskNo5;

public class MainClass {
	public static void main(String[] ags)
	{
		Box box1=new Box3D(1,2,3);
		getObject(box1);
		Box3D box2=new Box3D(2,3,4);
		getObject(box2);
	}
	public static void getObject(Box b1)
	{
		b1.area();
		b1.volume();
		System.out.println();
		
	}

}
