package stringAssign1;

public class ReverseEachWord {

	
	static void reverseEachWord()
	{
		String str=null,str1=null;
		try
		{
			str="woH era uoy ?";
			System.out.println("Original String : "+str);
			str1="";
			String arr[]=str.split(" ");
			
			for(int i=0;i<arr.length;i++)
			{
				for(int j=arr[i].length()-1;j>=0;j--)
				{
					str1=str1+arr[i].charAt(j);
				}
				str1=str1.concat(" ");
			}
			
			System.out.println("String with Reversed Words : "+str1);
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			str=null;
			str1=null;
		}
		
	}
	public static void main(String[] args) {
		
		reverseEachWord();
	}

}
