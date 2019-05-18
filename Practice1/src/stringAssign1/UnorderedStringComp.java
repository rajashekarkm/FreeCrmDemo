package stringAssign1;

import java.util.Arrays;

public class UnorderedStringComp {

	static void compareStrings(String str,String str1)
	{
		
		char ch[]=str.toCharArray();
		Arrays.sort(ch);
		
		char ch1[]=str1.toCharArray();
		Arrays.sort(ch1);
		
		String s=String.valueOf(ch);
		String s1=String.valueOf(ch1);
		
		if(s.equals(s1))
			System.out.println("Welcome Present");
		else
			System.out.println("Welcome Not Present");
			
	}
	public static void main(String[] args) {
		String str="welcome";
		String str1="wcomele";
		compareStrings(str,str1);	
	}

}
