package stringAssign1;

public class NooccrofString {

	static void noOfOccur()
	{
		String str=null,findstr=null;
		
		try
		{
			int count=0;
			str="out city is our responsibility our our duty is our";
			
			//String to Find occurrence
			findstr="our";
			
			//convert the String to Array
			String[] str1=str.split(" ");
			
			for(int i=0;i<str1.length;i++)
			{
				if(str1[i].equals(findstr))
					count++;
			}
			
			System.out.println("The String "+ findstr + " Occured "+ count + " Times");
			
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
		
		noOfOccur();
	}

}
