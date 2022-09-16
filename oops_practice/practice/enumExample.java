package practice;
 enum enumExample1{
	SUN,MON,TUES,WED,THUR,FRI,SAT
}

public class enumExample {
	public static void main(String[] agrs)
	{
		enumExample1[] enum1=enumExample1.values();//using value()
		for(enumExample1 n:enum1)
		System.out.println(n);
		enumExample1[] enum2=enumExample1.values();
		for(enumExample1 n:enum2)
		{
			System.out.println(n+"  place is : "+n.ordinal());//we are using ordinal()
		}
		enumExample1 enum3[]=enumExample1.values();
		for(enumExample1 n:enum3)
		switch(n)
		{
		case SUN:
			System.out.println("today is sunday and it is "+n.ordinal()+"day of week");
			break;
		case MON:
			System.out.println("today is monday and it is "+n.ordinal()+"day of week");
			break;
		case TUES:
			System.out.println("today is tuesday and it is "+n.ordinal()+"day of week");
			break;
		case WED:
			System.out.println("today is wednesday and it is "+n.ordinal()+"day of week");
			break;
		case THUR:
			System.out.println("today is thursday and it is "+n.ordinal()+"day of week");
			break; 
		case FRI:
			System.out.println("today is Friday and it is "+n.ordinal()+"day of week");
			break;
		case SAT:
			System.out.println("today is saturday and it is "+n.ordinal()+"day of week");
			break;
		}
			
		
	}
	


}
