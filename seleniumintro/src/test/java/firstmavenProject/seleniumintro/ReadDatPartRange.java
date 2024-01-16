package firstmavenProject.seleniumintro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDatPartRange {

	public void ReadData(int initial, int end) throws IOException
	{
			File f= new File("../seleniumintro/Hello2.txt");
			FileReader fr=new FileReader(f);
			BufferedReader b=new BufferedReader(fr);
			int deepak=0;
			String s;
			while((s=b.readLine())!=null)
			{
			deepak=deepak+1;
			if((deepak>=initial)&&(deepak>=end))
			{
			  System.out.println(s);
		
			}
			}
		}
		public static void main(String[] args) throws IOException {
			ReadDatPartRange d=new ReadDatPartRange();
			d.ReadData(1,2);
		}
	
	
}
