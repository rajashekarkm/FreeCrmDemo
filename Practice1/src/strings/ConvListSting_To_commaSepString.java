package strings;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
public class ConvListSting_To_commaSepString {
	public static void main(String args[])
	{
		//Create the List of String Values
		List<String> list=new ArrayList<String>(Arrays.asList("raju","ravi","rekha","ravi"));
		
		list.add("rashmi");
		
		//Print the List 
		System.out.println(list);
		
		//store String list  in String
		String str=String.join(" @ ", list);
		
		System.out.println("String value from list : "+str);
		
		
		Set<String> set=new HashSet<String>(Arrays.asList("hello","hi","how","are","you","hi"));
		
		String str1=String.join(", ", set);
		
		System.out.println("String value from Set : "+str1);
		
		System.out.println(str1.replace(", ","~~"));
		
	}
}
