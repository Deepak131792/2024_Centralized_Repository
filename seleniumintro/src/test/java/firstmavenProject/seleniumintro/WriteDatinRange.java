package firstmavenProject.seleniumintro;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteDatinRange {

	public void writeData(int initial,int end) throws IOException
	{
		File f=new File("../seleniumintro/Maxcond.txt");
		 FileWriter fw=new FileWriter(f);
		 BufferedWriter b=new BufferedWriter(fw);
		 Scanner sc=new Scanner(System.in);  //By Using Scanner class
		 String Data;
		 System.out.println("Please enter Data");
		 for(int i=initial;i<end;i=i+1)
		 {
			// b.write("myname is Deepak");
			if((i>=initial)&&(i<=end))
			{
			 Data=sc.next();
		     b.write(Data);
			 b.newLine();
		 }
			else
			{
				 b.newLine();
			}
           
		 }
		 b.close();
	}
	
public static void main(String[] args) throws IOException {
	WriteDatinRange d=new WriteDatinRange();
	d.writeData(1,6);
}
}
