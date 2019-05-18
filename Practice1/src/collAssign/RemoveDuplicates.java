package collAssign;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	static void removeDuplicate()
	{
		List<Integer> list=null;
		List<Integer> listwithoutduplicates=null;
		try
		{
			list=new ArrayList<Integer>(3);
			list.add(24); list.add(34); list.add(54); list.add(64); list.add(24); list.add(24);
			list.add(34);
			
			
			System.out.println("List with Duplicates :"+ list);
			listwithoutduplicates=list.stream().distinct().collect(Collectors.toList());
			System.out.println("Without Duplicates "+listwithoutduplicates);
			
			
			Object[] listArray=list.toArray();
			
			for(Object val:listArray)
			{
				if(list.indexOf(val)!=list.lastIndexOf(val))
					list.remove(list.lastIndexOf(val));
				
			}
			System.out.println(" List without Duplicates :"+ list);
			
			
			
			List<Character> str1=new ArrayList<Character>();
			str1.add('s');  str1.add('i'); str1.add('l');  str1.add('e');	 str1.add('t');		
			
			List<Character> str2=new ArrayList<Character>();
			str1.add('l');  str1.add('i'); str1.add('l');  str1.add('t');	 str1.add('n');	
			
			if(str1.containsAll(str2) && str2.containsAll(str1))
				System.out.println("anagram");
			else
				System.out.println("Not angram");
			
		}catch(Exception e)
		{
			System.out.println(e);
			
		}
		finally
		{
			
			list=null;
		}
		
	}
	
	public static void main(String[] args) {
		
		
		removeDuplicate();
	}

}
