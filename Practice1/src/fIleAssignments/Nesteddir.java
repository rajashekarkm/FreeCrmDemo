package fIleAssignments;

import java.io.File;

public class Nesteddir {

	public static void main(String[] args)
	{
		File f1=null;
		
		try
		{
		String str[]={"dir1","dir2","dir3","dir4","dir5","dir6"};
		
		for(String s:str)
		{
			f1=new File("G:\\TextFiles\\txtfilesrename\\"+s);
			
			if(f1.mkdir())
				System.out.println("dir created");
			else
				System.out.println("dir not created");
			
		}
		
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
