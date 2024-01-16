package firstmavenProject.seleniumintro;
import java.io.File;
import java.io.IOException;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Xlswritedata 
{
  public void writeData() throws RowsExceededException, WriteException, IOException 
  {
	File f =new File("..//seleniumintro/Practicexls2.xls");
	WritableWorkbook bk= Workbook.createWorkbook(f);
	WritableSheet bs=bk.createSheet("DC",0);
	for(int i=0;i<5;i=i+1)
	{
		for (int j=0;j<5;j=j+1)
		{
			Label L=new Label(j, i, "AmanDeep");
			bs.addCell(L);
		}
	}
           bk.write();
           bk.close();
  }
	public static void main(String[] args) throws RowsExceededException, WriteException, IOException 
	{
		Xlswritedata w= new Xlswritedata();
		w.writeData();
	}

}
