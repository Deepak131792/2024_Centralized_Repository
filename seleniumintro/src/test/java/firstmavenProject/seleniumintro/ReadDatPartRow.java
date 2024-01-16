package firstmavenProject.seleniumintro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadDatPartRow 
{

	public void ReadData(int Rownum) throws IOException
	{
			File f= new File("../seleniumintro/Hello2.txt");
			FileReader fr=new FileReader(f);
			BufferedReader b=new BufferedReader(fr);
			int deepak=0;
			String s;
			while((s=b.readLine())!=null)
			{
			deepak=deepak+1;
			if(deepak==Rownum)
			{//System.out.println((char)a);
			
				System.out.println(s);
				break;
			}
			}
		}
		public static void main(String[] args) throws IOException {
			ReadDatPartRow d=new ReadDatPartRow();
			d.ReadData(1);
		}
		
}	


	


