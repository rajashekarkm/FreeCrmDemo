package collAssign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateInList {

	static void duplicate()
	{
		List<Integer> list=null;
		try
		{
			
			list=new ArrayList<Integer>();
			list.add(24); list.add(34); list.add(54); list.add(64); list.add(54); list.add(24);
			
			Object[] arr= list.toArray();
			
			System.out.println(Arrays.toString(arr));
			System.out.print("Duplicate Values In List : ");
			for(int i=0;i<arr.length-1;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
						System.out.print(arr[i]+" ");
				}
			}
			
			
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
		
		
		duplicate();
	}

}
