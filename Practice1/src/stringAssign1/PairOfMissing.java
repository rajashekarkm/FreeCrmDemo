package stringAssign1;

public class PairOfMissing {
	
	static int countChar(String str,String ch)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(String.valueOf(str.charAt(i)).contains(ch))
				count++;
		}
		return count;
	}
	
	static void pairOfMissing()
	{
		String str="ABC({[xyz]})";
		boolean pRes=false,bRes=false,bracRes=false;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(' || str.charAt(i)==')')
			{
				if(countChar(str,"(")==countChar(str,")"))
					pRes=true;
			}
			else if(str.charAt(i)=='{' || str.charAt(i)=='}')
			{
				if(countChar(str,"{")==countChar(str,"}"))
					bRes=true;
			}
			else if(str.charAt(i)=='[' || str.charAt(i)==']')
			{
				if(countChar(str,"[")==countChar(str,"]"))
					bracRes=true;
			}
		}
		
		if(pRes==true && bRes==true && bracRes==true)
			System.out.println("Braces Are Ended Properly");
		else
			System.out.println("Braces Are Not Ended Properly");
	}
	
	public static void main(String[] args)
	{
		
		pairOfMissing();
	}
	
}
