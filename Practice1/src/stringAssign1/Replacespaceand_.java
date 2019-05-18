package stringAssign1;

public class Replacespaceand_ {

	
	static void replace_andspace()
	{
		String str=null;
		String underscore=null;
		try
		{
			str="abc Xyz mno a_z 1_2";
			System.out.println("Original String : "+str);
			underscore=str.replace(" ", "_");
			System.out.println("Replaced space by _  : "+underscore);
			
			
			
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
		
		replace_andspace();
	}

}
