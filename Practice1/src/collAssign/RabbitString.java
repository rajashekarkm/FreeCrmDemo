package collAssign;

public class RabbitString {

	static void findUnorderdString(String str,String str1)
	{
		boolean flag=false;
		for(int i=0;i<str1.length();i++)
		{
			if(str.contains(String.valueOf(str1.charAt(i))))
			{
				flag=true;
			}
			else
			{
				flag=false;
				break;
			}
		}
		System.out.println(str1+" = "+flag);
	}
	public static void main(String[] args) {
		String str="rabbiitttt";
		findUnorderdString(str,"tabbit");
		findUnorderdString(str,"xabbit");
		findUnorderdString(str,"tib");
		
	}

}
