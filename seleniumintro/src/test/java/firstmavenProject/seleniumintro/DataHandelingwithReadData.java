package firstmavenProject.seleniumintro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DataHandelingwithReadData 
{

	public void ReadData() throws IOException
	{
		File f= new File("../seleniumintro/hello.txt");
		FileReader fr=new FileReader(f);
		BufferedReader b=new BufferedReader(fr);
		//int a;
		//while((a=fr.read())!=-1)
		String s;
		while((s=b.readLine())!=null)
		{
			//System.out.println((char)a);
			System.out.println(s);
		}
		
	}
	public static void main(String[] args) throws IOException {
		DataHandelingwithReadData d=new DataHandelingwithReadData();
		d.ReadData();
	}
	
}
