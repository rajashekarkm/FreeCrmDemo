package strings;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class StringIntern {

	public static void main(String[] args) {
		
		
		String str=new String("Geeks");
		
		// whenever a Srting Object Created it creates two memories such as In Heap and StringConstant Pool(SCP)
		
		
		String str2=str.intern();
		// Now the value stored i str2 and and the value of str in SCP is same 
		// Hence str2 points to str of SCP
		
		
		//compare memory locations of str and str2
		if(str==str2)
			System.out.println("Same Locations");
		else
			System.out.println("Different Locations"); //str locations always point to HeapMemory bcz it is an object
		
		
		String str3="Geeks";
		
		//compare values
		if(str.equals(str2))
			System.out.println("Strings are equal");
		else
			System.out.println("String are not equal");
		//compare locations of str2 and str3 both are in SCP
		if(str2==str3)
			System.out.println("Same Locations");
		else
			System.out.println("Different Locations");
		
		
		String s1="raju";
		String s2="raju";
		
		if(s1==s2)
			System.out.println("s1 and s2 pointinfg same SCP");
		else
			System.out.println("s1 and s2 pointing different SCP");
		
		
		String xy=String.join(" ","ab","ad","ef");
		System.out.println(xy);
		System.out.println("*************");
		System.out.println(xy.replace('a','x'));
		System.out.println(xy.replaceAll("a","x"));
		System.out.println(xy.replaceFirst(" ", "~~"));
		
		StringBuilder sb=new StringBuilder(xy);
		sb.replace(0, 4, "r");
		System.out.println(sb);
		
		
		Dictionary<String,String> dic=new Hashtable<String,String>();
		
		dic.put("123", "abcd");
		dic.put("234", "xyz");
		
		
		
		Enumeration<String> en=dic.keys();
		String key="";
		while(en.hasMoreElements())
		{
			key=en.nextElement();
		    System.out.println(dic.get(key));
		}
		
	}

}
