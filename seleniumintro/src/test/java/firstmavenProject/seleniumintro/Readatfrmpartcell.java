package firstmavenProject.seleniumintro;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Readatfrmpartcell {

	public void readData(int rowno,int columnno) throws IOException, BiffException
	{
		File f=new File("../seleniumintro/Practicexls.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet sh=wk.getSheet(0);
  	   Cell wc=sh.getCell(columnno,rowno);
	   System.out.println(wc.getContents());
	}
	public static void main(String[] args) throws IOException, BiffException {
		
		Readatfrmpartcell e=new Readatfrmpartcell ();
	     e.readData(2,2);
	 }
	}


