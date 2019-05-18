package legacyClasses;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class DictionaryDemo {
	public static void main(String[] args) {
		Dictionary<String, String> d = null;
		try {
			d = new Hashtable<>();
			d.put("A", "Apple");
			d.put("B", "Boy");
			d.put("C", "Cat");
			d.put("D", "Dog");
			d.put("E", "Eagle");
			
			System.out.println(d);
			
			//remove
			d.remove("E");
			
			HashMap<String,String> map=new HashMap<>();
			map.put(null, null);
			map.put("3", null);
			map.put("5", null);
			System.out.println(map);
			Enumeration<String> en = d.keys();
			while(en.hasMoreElements())
			{
				String s = (String) en.nextElement();
				System.out.println(s+" = "+d.get(s));
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			d = null;
		}
	}
}
