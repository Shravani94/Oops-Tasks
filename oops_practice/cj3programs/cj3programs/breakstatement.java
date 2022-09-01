package cj3programs;

public class breakstatement {
	public static int lcm=0;
	public static void main(String [] args)
	{
		int a=20;
		int b=24;
		
		for(int i=a;i<=a*b;i++)
		{
			if(i%a==0&&i%b==0)
			{
				 lcm=i;
				break;
			}
		}
		System.out.println(lcm);
	}

}
