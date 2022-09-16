package practice;
import java.util.Scanner;

public class mulitipleexception {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			int a=10;
			System.out.println("enter number");
			int num=sc.nextInt();
			int b=a/2;
			String str=null;
			int l=str.length();
	
			int arr[]= {1,2,3};
			System.out.println(arr[3]);
			}catch(ArithmeticException | ArrayIndexOutOfBoundsException|NullPointerException e) {
					System.out.println(e);
				}
				
			
	
	}

}
