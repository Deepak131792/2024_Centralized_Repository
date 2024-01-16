package firstmavenProject.seleniumintro;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class writetillMxcondi {

	public void writeData(int max) throws IOException
	{
		File f=new File("../seleniumintro/Maxcond.txt");
		 FileWriter fw=new FileWriter(f);
		 BufferedWriter b=new BufferedWriter(fw);
		 Scanner sc=new Scanner(System.in);  //By Using Scanner class
		 String Data;
		 System.out.println("Please enter Data");
		 for(int i=0;i<max;i=i+1)
		 {
			// b.write("myname is Deepak");
			 Data=sc.next();
		     b.write(Data);
			 b.newLine();
		 }
            b.close();
	}

public static void main(String[] args) throws IOException {
	writetillMxcondi d=new writetillMxcondi();
	d.writeData(5);
}
}