package stringAssign1;

public class ReverseString {

	static void reverseString()
	{
		String str=null,str1=null;
		try
		{
			str="Hello";
			System.out.println("Original String : "+str);
			str1="";
			for(int i=str.length()-1;i>=0;i--)
			{
				str1=str1+str.charAt(i);
				
			}
			System.out.println("Reversed String : "+str1);
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
		
		reverseString();
		
	}

}
