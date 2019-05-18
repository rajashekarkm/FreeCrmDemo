package stringAssign1;

public class SwapStrings {

	
	static void swapString(String str,String str1)
	{
		System.out.println("Before Swap: "+ str +" "+str1);
		String temp=str+str1;
		str1=temp.substring(0,str.length());
		str=temp.substring(str1.length());
		
		System.out.println("After Swap :  "+str +" "+str1);
		
		
		
	}
	public static void main(String[] args)
	{
		String str="Raja";
		String str1="Shekar";
		swapString(str,str1);
		
	}
	
	
}
