package fIleAssignments;

import java.io.File;
import java.util.Arrays;

public class Renametxtfiles {

	public static void main(String[] args) {
		
		File f1=null,f2=null,f3=null;
		try
		{
			f1=new File("G:\\TextFiles\\txtfilesrename");
			String[] names={"name1","name2","name3"};
			File str[]=f1.listFiles();
			System.out.println(Arrays.toString(str));
				for(int i=0;i<str.length;i++)
				{
					if(str[i].getPath().contains(".txt"))
					{
						for(String s:names)
						{
							f2=new File("G:\\TextFiles/txtfilesrename"+"\\"+s+".txt");
							str[i].renameTo(f2);
						}
					}
				}
			
			System.out.println(".txt files are renamed successfully");
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
