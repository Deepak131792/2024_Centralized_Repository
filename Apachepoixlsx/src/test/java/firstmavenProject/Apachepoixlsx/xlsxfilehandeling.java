package firstmavenProject.Apachepoixlsx;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xlsxfilehandeling {
	public void readExcel() throws IOException
	{
		File f=new File("../Apachepoixlsx/Practicexlsx.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook xs=new XSSFWorkbook(fi);
		XSSFSheet xt=xs.getSheetAt(0);
		int r=xt.getPhysicalNumberOfRows();
		for(int i=0;i<r;i=i+1)
		{
			 XSSFRow xr=xt.getRow(i);
			int c=xr.getPhysicalNumberOfCells();
			 for(int j=0;j<c;j=j+1)
			 {
				 XSSFCell xc=xr.getCell(j);
				 System.out.println(xc.getStringCellValue());
			 }
		 }		
	}
  public static void main(String[] args) throws IOException {
	     xlsxfilehandeling e=new xlsxfilehandeling();
         e.readExcel();	
}
}

