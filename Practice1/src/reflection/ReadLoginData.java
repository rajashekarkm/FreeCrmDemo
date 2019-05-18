package reflection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadLoginData {

	public static void main(String[] args) {
		
		
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		try
		{
			fin=new FileInputStream("R:\\Reflection3.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("Reflection3");
			
			if(sh==null)
			{
				throw new FileNotFoundException("Invalid File Name");
			}
			
			int rows=sh.getLastRowNum();
			Row row;
			String data=null;
			for(int i=1;i<=rows;i++)
			{
				row=sh.getRow(i);
				int cell=row.getLastCellNum();
				for(int j=0;j<cell;j++)
				{
					if(row.getCell(j)==null)
						row.createCell(j);
					
					Cell cellval=row.getCell(j);
					if(cellval==null || cellval.getCellType()==CellType.BLANK)
					{
						data="";
					}
					else if(cellval.getCellType()==CellType.BOOLEAN)
					{
						data=String.valueOf(cellval.getBooleanCellValue());
					}
					else if(cellval.getCellType()==CellType.NUMERIC)
					{
						
						
					}
	
					System.out.print(cellval+"   ");
				}
				System.out.println();
			}
			
		}catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	
 }

}
