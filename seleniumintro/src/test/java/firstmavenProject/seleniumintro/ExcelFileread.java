package firstmavenProject.seleniumintro;
import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelFileread {

	public void ReadData() throws BiffException, IOException
	{
		File f=new File("../seleniumintro/Practicexls.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet sh=wk.getSheet(0);
		int r=sh.getRows();
		int c=sh.getColumns();
		for(int i=0;i<r;i=i+1)
		{
		 for(int j=0;j<c;j=j+1)
		 {
		   Cell wc=sh.getCell(j,i);
	
	     	System.out.println(wc.getContents());
		 }
		}
		
	}
	public static void main(String[] args) throws BiffException, IOException {
		
	 ExcelFileread e=new ExcelFileread();
	 e.ReadData();
	 
	}
}