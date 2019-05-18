package stringAssign1;

public class Assign1and2 {
	
	
	//Extract specific String
	static void extract(String s,int index)
	{
		System.out.println("Extracted String : "+s.substring(index));
	}
	
	
	//Convert Each Word First Character Upper
	static void ConvertWordUpper(String s)
	{
		String rev=null;
		try
		{
			rev ="";
			String s1 [] = s.substring(11).split(" ");
			
			for(int i =0; i<s1.length; i++)
			{
			     String f = s1[i].substring(0, 1).toUpperCase();
			     String l = s1[i].substring(1);
			     rev = rev +" "+  (f+l);	
			}
			
			System.out.println("First Char of Word To Upper : "+rev.trim());
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			rev=null;
		}
	}
	
	public static void main(String[] args) {
		String s = "Welcome to SG testing institute";
		
		extract(s,11);
		ConvertWordUpper(s);
  
  }
}
