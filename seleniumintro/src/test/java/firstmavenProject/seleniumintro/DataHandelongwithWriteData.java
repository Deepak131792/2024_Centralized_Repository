package firstmavenProject.seleniumintro;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DataHandelongwithWriteData
{
public void WriteData() throws Exception
{
 File f=new File("../seleniumintro/hello.txt");
 FileWriter fw=new FileWriter(f);
 BufferedWriter b=new BufferedWriter(fw);
 b.write("First line of the File");
 b.newLine();
 b.write("Second line of the File");
 b.close();     //for saving and closing the file 
 
 }

	public static void main(String[] args) throws Exception 
	{
		DataHandelongwithWriteData d=new DataHandelongwithWriteData();
		d.WriteData();
		
	}
}
