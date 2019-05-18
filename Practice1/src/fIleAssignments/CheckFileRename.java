package fIleAssignments;

import java.io.File;
import java.util.Arrays;

public class CheckFileRename {

	public static void main(String[] args) {
		
		File f1=null,f2=null;
		try
		{
			f1=new File("G:\\TextFiles\\txtfilesrename\\name1.txt");
			f2=new File("G:\\TextFiles\\txtfilesrename\\name5.txt");
			
			long source=f1.lastModified();
			System.out.println(source);
			f1.renameTo(f2);
			long destination=f1.lastModified();
			
			System.out.println(destination);
			if(source!=destination)
				System.out.println("File Renamed");
			else
				System.out.println("File Not renamed");		
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
