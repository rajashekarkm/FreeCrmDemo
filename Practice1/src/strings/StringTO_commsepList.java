package strings;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class StringTO_commsepList {

	public static void main(String[] args) {
		
		//modifiable();
		unmodifiable();
		//unmodifiable1();
	}
	
	
	static void modifiable()
	{
		String str="Geeks for Geeks";
		
		String[]  ele=str.split(" ");
		
		System.out.println("String Array  ele : "+Arrays.toString(ele));
		
		List<String> list=new ArrayList<String>(Arrays.asList(ele));
		
		//modification allowed 
		list.add("forGeeks");
		System.out.println("Comma Separated List : "+list);
		
	}
	
	static void unmodifiable()
	{
		String str="Geeks for Geeks";
		
		String[]  ele=str.split(" ");
		
		System.out.println("String Array  ele : "+Arrays.toString(ele));
		
		List<String> list=new ArrayList<String>();
		
		
		list=Arrays.asList(ele);
		
		//modification not allowed in the above approach
		try
		{
		list.add("forGeeks"); 			//RunTime Exception java.lang.UnsupportedOperationException
		}catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Comma Separated List : "+list);
		
	}
	
	static void unmodifiable1()
	{
		String str="Geeks for Geeks";
		
		String[]  ele=str.split(" ");
		
		System.out.println("String Array  ele : "+Arrays.toString(ele));
		
		List<String> list=Arrays.asList(ele);
		
		//modification not allowed in the above approach
		try
		{
		list.add("forGeeks"); 			//RunTime Exception java.lang.UnsupportedOperationException
		}catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Comma Separated List : "+list);
		
	}
	

}
