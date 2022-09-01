package taskno4;
//interface having only one abstract method is called functional interface.
//functional interface does not extends interface which is having any abstract method
@FunctionalInterface  
public interface FunctionalInterface1 extends Intrface1  {
	void add();
	
	}
class Sample implements FunctionalInterface1{
	public void add() {
		System.out.println("from functional");
	}
	public static void main(String []ags) {
		FunctionalInterface1 inter=new Sample();
		inter.add();
		inter.add1();
		Intrface1.sub1();
	}
	
	
}
