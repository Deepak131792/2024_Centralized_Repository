package firstmavenProject.seleniumintro;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Appendata {

	public void AppendData() throws IOException
	{
		File f=new File("..//seleniumintro/hello.txt");
		FileWriter fw=new FileWriter(f,true);
		BufferedWriter b=new BufferedWriter(fw);
		b.newLine();
		b.write("Third  Line of the File");
		b.newLine();
		b.write("Fourth Line of the File");
		b.close();
		
	}
public static void main(String[] args) throws IOException {
	
	Appendata a=new Appendata();
	a.AppendData();
}
}
	
