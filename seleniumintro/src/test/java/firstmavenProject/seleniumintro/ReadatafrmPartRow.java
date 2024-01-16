package firstmavenProject.seleniumintro;

import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadatafrmPartRow {

	public void readData(int rowno) throws IOException, BiffException
	{
		File f=new File("../seleniumintro/Practicexls.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet sh=wk.getSheet(0);
		int rows;
		int columns;
		for(int i=0;i<rows;i=i+1)
		{
			if(i==rowno)
			{
			for(int j=0;i<columns;j=j+1)
			{
				  int wc=sh.getRows();
				  System.out.println(wc);	
			}
		}
	}
	
	}
	public static void main(String[] args) throws IOException, BiffException {
		ReadatafrmPartRow e=new ReadatafrmPartRow();
	     e.readData(5);
	 }
	}
	

