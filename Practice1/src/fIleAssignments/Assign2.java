package fIleAssignments;


import java.io.File;
public class Assign2 {	
	static void createFile()
	{
		
		File f1=null;
		File f2=null;
		File files=null;
		String[] filestocreate={"file1","file2","file3","file4","file5","file6","file7"};
		String[] filestorename={"sun","mon","tue","wed","thu","fri","sat"};
		try
		{
			for(String s:filestocreate)
			{
				f1=new File("G:\\TextFiles\\"+s+".txt");
				f1.createNewFile();
			}
			System.out.println("Seven Files are created ");
			
			
			files=new File("G:\\TextFiles");	
			File[] filenames=files.listFiles();
			
			for(int i=0;i<filestorename.length;i++ )
			{
					f2=new File("G:\\TextFiles\\"+filestorename[i]+".txt");
					filenames[i].renameTo(f2);	
			}
			
			
			System.out.println("Seven Files are Renamed ");
		}catch(Exception e)
		{
			System.out.println("File Not Created"+e);
		}finally{
			
		}
	}
	public static void main(String[] args) {
		createFile();
		
		
	}

}
