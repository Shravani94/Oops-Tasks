package cj4programs;

public class singleinheritance {
	public void test()
	{
		System.out.println("take a test");
	}

}
class inheritance extends singleinheritance{
	public void result()
	{
		System.out.println("see the result");
	}
	public static void main(String[] args)
	{
		singleinheritance s1=new inheritance();//upcasting
		s1.test();
		inheritance i1=(inheritance)s1;//downcasting
		i1.test();
		i1.result();
		
	}
}
