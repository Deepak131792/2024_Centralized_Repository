package Package1;

public class Studenta {
	int age;
	int rollno;
	
	public void display1()
	{
System.out.println("Welcome to All Of you");
	}
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args) {
	
		Studenta xyz= new Studenta();
		xyz.display1();
		xyz.display2();
		xyz.age=22;
		xyz.rollno=111;
		System.out.println(xyz.age);
		System.out.println(xyz.rollno);
	
	}
}
