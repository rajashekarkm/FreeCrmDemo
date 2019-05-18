package strings;

import java.util.Arrays;

public class StringImmutable {

	
	public static void arrModifiCheck(int[] a)
	{
		a[0]=45;
		System.out.println(Arrays.toString(a));
		
	}
	public static void main(String[] args) {
		
		int [] a= {10,20};
		
		System.out.println(Arrays.toString(a));
		arrModifiCheck(a);
		System.out.println(Arrays.toString(a));
	
		String s1="hello";
		String s2="hello";
		String s3="hi";
		
		System.out.println(s1.hashCode()+"   "+ s2.hashCode()+ "  "+s3.hashCode());
		
		s2="hu";  
		
		System.out.println(s1.hashCode()+"   "+ s2.hashCode()+ "     "+s3.hashCode());
		

		
		String str="ILOveYou";
		
		
		char[] strarr=str.toCharArray();
		int count=0;
		for(int i=0;i<strarr.length;i++)
		{
			count++;
		}
		
		System.out.println(count);
		
		
		//----------------------------
		int val=0;
		try
		{
			while(0<=val)
			{
				str.charAt(val++);
			}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		System.out.println(--val);
		
		
		
	}

}
