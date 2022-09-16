package practice;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Practice {
	public static void main(String[] main)
	{
		List<String>list1=new ArrayList<String>();
		list1.add("aaa");
		list1.add("bbb");
		list1.add("aaa");
		list1.add("ccc");
		Optional<String> list2=list1.stream().distinct().findFirst();
		System.out.println(list2);
		int n=(int) list1.stream().count();
		System.out.println(n);
		List<String> list3=list1.stream().distinct().collect(Collectors.toList());
		System.out.println(list3);
		List<String>list4=list1.stream().skip(2).collect(Collectors.toList());
		System.out.println(list4);
		List<String>list5=(List<String>) list1.stream().filter(e->e.equals("aaa")).collect(Collectors.toList());
		System.out.println(list5);
		List<String>list6=list1.stream().map(ele->ele).collect(Collectors.toList());
		System.out.println(list6);
		List<String>list7=Stream.of(list1,list4,list5).flatMap(list->list.stream()).collect(Collectors.toList());
		System.out.println(list7);
		list7.stream().filter(name->name!="aaa").forEach(System.out::println);
		String list8=list1.stream().map(ele->ele).reduce((a,b)->a+b);
		System.out.println(list8);
		
		
		
	}

}
