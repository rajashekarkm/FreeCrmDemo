package stringAssign1;

public class NoofCharDigit {

	
	static void noofCharDigit()
	{
		String str=null;
		
		try
		{
			int cCount=0,dCount=0,oCount=0;
			
			str="Hello@123***";
			char arr[]=str.toCharArray();
			
			for(int i=0;i<arr.length;i++)
			{
				if(Character.isAlphabetic(arr[i]))
					cCount++;
				else if(Character.isDigit(arr[i]))
					dCount++;
				else
					oCount++;	
			}
			
			System.out.println("The Number of Characters : "+cCount );
			System.out.println("The Number of Digits : "+dCount );
			System.out.println("The Number of Other characters : "+oCount );
			
			
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
		
		noofCharDigit();
		
	}

}
