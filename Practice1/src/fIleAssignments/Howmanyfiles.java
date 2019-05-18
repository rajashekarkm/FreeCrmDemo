package fIleAssignments;

import java.io.File;

public class Howmanyfiles {

	public static void main(String[] args) {
		
		File f1=null;
		try
		{
			f1=new File("G:\\TextFiles");
			File str[]=f1.listFiles();
			int count=0;
			for(int i=0;i<str.length;i++)
			{
				if(str[i].isFile())
				{
					count++;
				}
			}
			System.out.println("The no of files in Dir : "+count);
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			f1=null;
			
		}
		
		
	}

}
