package firstmavenProject.Apachepoixlsx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writedata {

	public void writeExcel() throws IOException
	{
		File f=new File("../Apachepoixlsx/Practicexlsx1.xlsx");
		FileOutputStream fo=new FileOutputStream(f);
		XSSFWorkbook xs=new XSSFWorkbook();
		XSSFSheet xt=xs.createSheet("Deepak");
		System.out.println("Please enter data");
		Scanner s=new Scanner(System.in);
		String data;
		for(int i=0;i<3;i=i+1)
		{
			 XSSFRow xr=xt.createRow(i);
			 for(int j=0;j<3;j=j+1)
			 {
				 XSSFCell xc=xr.createCell(j);
				 data=s.next();
				// xc.setCellValue("DEEPAK");
				 xc.setCellValue(data);
			 }
		 }		
	   xs.write(fo);
	   fo.flush();
	   fo.close();
	}
    public static void main(String[] args) throws IOException {
        	writedata e=new writedata();
           e.writeExcel();	
           
}
}
	

