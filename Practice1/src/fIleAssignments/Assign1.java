package fIleAssignments;

import java.io.File;

public class Assign1 {

	public static void main(String[] args) {
		
		
		File f1=null;
		File f2=null;
		try
		{
			f1=new File("G:\\TextFiles\\Sample.text");
			f2=new File("G:\\TextFiles\\Rename.text");
			if(f1.exists())
			{
				System.out.println("The File Exists");
				f1.renameTo(f2);
				System.out.println("File Renamed Successfully");	
			}
			else
				System.out.println("The File Not Exists");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			f1=null;
			
		}
		
		
		
		
	}

}
