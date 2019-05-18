package stringAssign1;

public class AlterrnativeCase {

	
	static void alterrnativeCase()
	{
		String str=null;
		try
		{
			str="Rajashekar";
			
			for(int i=0;i<str.length();i++)
			{
				if(i%2==0)
					System.out.print(String.valueOf(str.charAt(i)).toUpperCase());
				else
					System.out.print(String.valueOf(str.charAt(i)).toLowerCase());
			}
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
	
		alterrnativeCase();
	}

}
