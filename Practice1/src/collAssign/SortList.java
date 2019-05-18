package collAssign;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class SortList {

	static void sortList()
	{
		List<Integer> list=null;
		try
		{
			list=new ArrayList<Integer>();
			list.add(10); list.add(8); list.add(9); list.add(11); list.add(2);
			
			System.out.println("Before Sort  : "+list);
			for(int i=0;i<list.size()-1;i++)
			{
				for(int j=i+1;j<list.size();j++)
				{
					if(list.get(i)>list.get(j))
					{
						Integer temp=list.get(i);
						list.set(i, list.get(j));
						list.set(j, temp);
					}
				}
			}
			System.out.println("After Sort   : "+list);
			
			
			
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			list=null;
		}
		
	}
	
	static void sortList_TreeSet()
	{
		List<Integer> list=null;
		try
		{
			list=new ArrayList<Integer>();
			list.add(10); list.add(8); list.add(9); list.add(11); list.add(2);
			
			System.out.println("Before Sort  : "+list);
			
			Set<Integer> sortlist=new TreeSet<>(list);
			
			System.out.println("After Sort  : "+sortlist);
			
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
		
		
		//sortList();
		sortList_TreeSet();
	}

}
