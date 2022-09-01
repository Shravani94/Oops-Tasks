package taskno4;
//@FunctionalInterface  
public interface Intrface1{
	default void add1() {
		System.out.println("from interface1 default method");
	}
	static void sub1() {
		System.out.println("from interface2 from static ");
	}
}
	
	

