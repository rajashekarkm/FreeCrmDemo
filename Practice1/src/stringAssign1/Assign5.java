package stringAssign1;



public class Assign5 {

	public static void main(String[] args) {
		
		
		String s="abcabcaba";
		
		char ch[]=s.toCharArray();
		int count=0;
		String s1="";
		
		
		for(int i=0;i<ch.length-1;i++)
		{
			for(int j=0;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
				}
			}
			if(!s1.contains(String.valueOf(ch[i])))
			{
				s1=s1.concat(String.valueOf(ch[i]));
				System.out.println(ch[i]+" Present : "+count +" Times ");
			}
			count=0;
		}
	}
}
