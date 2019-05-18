package legacyClasses;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		
		Hashtable<String,String> ht=null;
		try
		{
			ht=new Hashtable<>();
			ht.put("a", "dog");
			ht.put("b", "cat");
			ht.put("m", "monkey");
			ht.put("e","elephant");
			ht.put("x","elephant");
			
			Enumeration<String> en=ht.keys();
			while(en.hasMoreElements())
			{
				String s=(String) en.nextElement();
				System.out.println(s+"  "+ht.get(s));
				
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
