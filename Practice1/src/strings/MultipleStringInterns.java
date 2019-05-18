package strings;

public class MultipleStringInterns {

	
	public static void main(String args[])
	{
		
		String s1=new String("raja");  //  stores in both Heap and SCP but pointing to Heap location always
		
		String s2=s1.concat("shekar");	//stores in new SCP as Value  rajashekar
		
		String s3=s2.intern();		//points s2 SCP
		
		
		if(s1==s2)
			System.out.println("s1 ans s2 are same loc");
		else
			System.out.println("s1 ans s2 not same loc");
		
		
		if(s2==s3)
			System.out.println("s2 ans s3 are same loc");
		else
			System.out.println("s2 ans s3not same loc");
		
		String s4="rajashekar";
		
		if(s3==s4)
			System.out.println("s4 ans s3 are same loc");
		else
			System.out.println("s4 ans s3 not same loc");
		
		
		
	}
}
