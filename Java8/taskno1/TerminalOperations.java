package taskno1;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
//*Terminal operation in java is a method applied to stream as final step,is return result
import java.util.stream.Stream;

public class TerminalOperations {
	public static void main(String[]args)throws Exception
	{
	
		try {
			
		ArrayList<String> things=new ArrayList<String>();
		things.add("Bottle");
		things.add("Book");
		things.add("pen");
		things.add("mouse");
		Stream<String>things2=Stream.of("shravani","rakushna","pavan","babu");
		Stream<Integer>stream=Stream.of(1,2,3,4);
		Stream<Character>stream1=Stream.of('a','b','c','d');
		Stream<String> name1=things.stream().filter(name->name.equals("shravani"));
		System.out.println("----------reduce------------");
		String strings=things.stream().reduce("This is", (temp,things1)->temp+things1);
		System.out.println(strings);
		System.out.println("----------forEach-----------");
		things.stream().forEach(name->System.out.println(name));
		System.out.println("-------------forEachOrder---------");
		things.stream().forEachOrdered(names->System.out.println(names));
		System.out.println("-----------filter----------");
		Stream<String> names=things.stream().filter(name->name.equals("Book"));
		System.out.println(names);
		System.out.println("-------------collect---------");
		ArrayList<String>list=(ArrayList<String>) things.stream().collect(Collectors.toList());
		System.out.println(list);
		System.out.println("------------allmatch----------");
		boolean b1=things2.allMatch(name->name.length()==10);
		System.out.println(b1);
		System.out.println("-------------anymatch-----------");
		boolean b2=stream.anyMatch(i->i>3);
		System.out.println(b2);
		System.out.println("-----------noneMatch-----------");
		boolean b3=stream1.noneMatch(name->name=='f');
		System.out.println(b3);
		
		
		}catch(Exception e){
e.printStackTrace();}
		
		
		
		
	
	}

}
