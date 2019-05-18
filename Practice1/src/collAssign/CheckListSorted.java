package collAssign;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class CheckListSorted {

	static void checkSorted()
	{
		List<Integer> list=null;
		try
		{
			list=new ArrayList<Integer>();
			list.add(10); list.add(18); list.add(19); list.add(20); list.add(22);
			
			System.out.println(list);
			int find=90;
			System.out.println("raju");
			
			//Verify the given value is present or not
			if(list.contains(find))
				System.out.println("The Value  :"+find+"  is in The List ");
			else
				System.out.println("The Value  :"+find+"   Not in The List ");
			
			
			//check sorted or not(Ascending)
			int flag=0;
			for(int i=0;i<list.size()-1;i++)
			{
				if(list.get(i)>list.get(i+1))
				{
					flag=0;
					break;
				}
				else
					flag=1;
			}
			if(flag==1)
				System.out.println("Sorted List");
			else
				System.out.println("UnSorted List");
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			list=null;
		}
	}
	
	static void checkSorted_UsingArray()
	{
		List<Integer> list=null;
		try
		{
			list=new ArrayList<Integer>();
			list.add(10); list.add(18); list.add(19); list.add(20); list.add(22);
			
			System.out.println(list);
			
			Object[] a=list.toArray();
			
			Arrays.sort(a);
			
			System.out.println(Arrays.equals(a, list.toArray()));
			
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
		//checkSorted();
		checkSorted_UsingArray();
	}

}
