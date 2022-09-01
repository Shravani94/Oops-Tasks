package taskno3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterMediateOperations {
	public static void main(String[] args) {
	Stream<String>list=Stream.of("nibba","nibbi","dinga","dingi");
	System.out.println("-------peek-------");
	Stream list1=list.peek(e->System.out.println(e));
	list1.forEach(String->System.out.println(String));
	System.out.println("----------distinct----");
	Stream str=Stream.of("one","two","three","one","four","three");
	Stream str1=str.distinct();
	str1.forEach(String->System.out.println(String));
	System.out.println("---------skip----------");
	Stream str3=Stream.of("apple","orange","mango","grapes");
	Stream str4=str3.skip(1).map(string->string);
	str4.forEach(name->System.out.println(name));
	System.out.println("----------limit------");
	Stream str5=Stream.of("black","red","white","yellow");
	Stream str6=str5.limit(3).map(string->string);
	str6.forEach(name->System.out.println(name));
	System.out.println("-----flatMap---------");
	List<String> str7=(List<String>) Stream.of(Arrays.asList("sss","rrrr","tttt"),Arrays.asList("aaa","bbb","ccc"));
	List<String>str8=str7.stream().flatMap(li->Stream.of(li)).collect(Collectors.toList());
	str8.forEach(System.out::println);
	
	
	
	
	}
	
	

}
