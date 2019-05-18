package stringAssign1;

public class MaxOcccurChar {

	public static void main(String[] args) {
		
		
		String s="My name is Rajashekar";
		char ch='\0';
		int count=1,maxcount=1;
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
					count++;
				else if(count>maxcount)
				{
					maxcount=count;
					ch=s.charAt(i);
				}
			}
			count=1;
		}
		if(count>maxcount)
		{
			maxcount=count;
			ch=s.charAt(s.charAt(s.length()-1));
		}
		
		
		System.out.println("The max Occurance of Char is "+ch+ " has :  "+maxcount + " Times");
		
		
	}
}
