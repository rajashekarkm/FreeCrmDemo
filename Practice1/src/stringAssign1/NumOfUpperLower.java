package stringAssign1;

import java.util.Arrays;

public class NumOfUpperLower {

	
	static void numOfUpperLower()
	{
		String str=null;
		int Ucount=0,lCount=0;
		try
		{
			str="RajaSheKaR";
			char arr[]=str.toCharArray();
			System.out.println(Arrays.toString(arr));
			for(int i=0;i<arr.length;i++)
			{
				if(Character.isUpperCase(arr[i]))
					Ucount++;
				else
					lCount++;
			}
			
			System.out.println("The Number Of Upper Case Character : "+Ucount );
			System.out.println("The Number Of Lower Case Character : "+lCount );
			
			
		}catch(Exception e)
		{
			System.out.println(e);
			
		}
		finally
		{
			str=null;
			
		}
		
	}
	public static void main(String[] args) {
		
		numOfUpperLower();
	}

}
