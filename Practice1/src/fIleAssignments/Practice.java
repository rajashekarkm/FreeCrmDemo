package fIleAssignments;

import java.util.StringTokenizer;

interface ex
{
	
	public static int answer=10;

}

public class Practice {

	static
	{
		example();
	}
	
	static void example()
	{
		System.out.println("static method");
	}
	int methodOfA()
	{
		return (true?null:0);
	}
	
	
	public static void main(String[] args) {
		try
		{
			String str= "hi hello ";
			StringTokenizer st=new StringTokenizer("",str);
		 Class.forName("fIleAssignments.Practice");
		 Practice p=new Practice();
		 System.out.println(p.methodOfA());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
