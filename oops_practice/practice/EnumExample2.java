package practice;

import java.util.Scanner;

enum Days
{
	JAN(31), FEB,Mar(31),APR(30),MAY(31),JUN(30),JUL(31),AUG(31),SEP(30),OCT(31),NOV(30), DEC(31);

	int days;

	Days(int days)
	{
		this.days = days;
		//System.out.println("Inside Constructor");
	}

	Days()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 29 for leap Year/28 for normal Year");
		int num=sc.nextInt();
		if(num==29)
		{
		this.days = 29;
		//System.out.println("Inside No Argument Constructor");
		}
		else
		{
			this.days=28;
		}
	}

	public int getDays()
	{
		return days;
	}
}

public class EnumExample2
{
	public static void main(String arg[])
	{
		Days[] b = Days.values();
		for (Days b1 : b)
		{
			System.out.println(b1 + " number of days " + b1.getDays());
		}
	}
}