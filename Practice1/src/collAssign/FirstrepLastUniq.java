package collAssign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstrepLastUniq {

	static void firstrepLastUniq()
	{
		
		List<String> list=null;
		try
		{
			
			list=new ArrayList<String>();
			list.add("rashmi");list.add("raju"); list.add("ravi"); list.add("raju"); list.add("rekha"); list.add("raju"); list.add("ravi");
			 list.add("ravi");
			
			
			Object[] names=list.toArray();
			System.out.println(Arrays.toString(names));
			Object uniqname="";
			for(Object name:names)
			{
				if(list.indexOf(name)!=list.lastIndexOf(name))
				{
					
					System.out.println("First Repeated Value : "+name);
					break;
				}
			}
			
			for(Object name:names)
			{
				if(list.indexOf(name)==list.lastIndexOf(name))
				{
					uniqname=name;
				}
			}
			
			System.out.println("Last Unique Value : "+uniqname);
			
			
			
		}catch(Exception e)
		{
			
		}
		finally
		{
			list=null;
		}
		
		
	}
	
	public static void main(String[] args) {
	
		
		firstrepLastUniq();
	}

}
