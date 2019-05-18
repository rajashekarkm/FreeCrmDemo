package stringAssign1;

import java.util.Arrays;

public class Replace_AsSecondOccr {

	static void replace_AsSecondOccr(String str)
	{
		char ch[]=str.toCharArray();
		
		int count=1;
		
		for(int i=0;i<ch.length-1;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
					count++;
				
				if(count>=2 && ch[i]==ch[j])
					ch[j]='_';
			}
			count=1;
		}
		
		String res=String.valueOf(ch);
		System.out.println(res);
	}
	public static void main(String[] args) {
		
		String str="india is great";
		replace_AsSecondOccr(str);
		
	}

}
