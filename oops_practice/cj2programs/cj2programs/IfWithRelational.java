package cj2programs;

public class IfWithRelational {
	public static void main(String[]args)
	{
		int a=20;
		int b=30;
		int c=25;
		if(a>b)//simple if
		{
			System.out.println("a greatest number");
			
		}
		if(a<b)//if else
		{
			System.out.println("a is smaller number");
			
		}
		else {
			System.out.println("a larger number");
		}
		if(a>b) {//else if
			System.out.println("a is larger");
			
		}
		else if(b>c)
		{
			System.out.println("b is larger number");
		}
		else if(a>c)
		{
			System.out.println("a is larger");
		}
		else
		{
			System.out.println("c is larger number");
		}
	}

}
