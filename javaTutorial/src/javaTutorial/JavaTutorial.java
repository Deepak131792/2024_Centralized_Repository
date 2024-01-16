package javaTutorial;
import java.util.Scanner;
public class JavaTutorial {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Name :");
		String Student_name=scan.next();
		
		System.out.println("Enter Your Marks :");
		int Student_marks=scan.nextInt();
		

		Student s =new Student (Student_name, Student_marks);
		s.show_details();
		

		
		
	}

}
