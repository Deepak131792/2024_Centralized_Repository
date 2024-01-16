package inheritance;

public class Car extends Vehicles {
	
	String colour= "Blue";
	int Tyres=4;
	public void show_Car_details() {
		System.out.println("I am a Car");
		System.out.println("The Colour of the car is :"+colour);
		System.out.println("The number of tyres is :"+Tyres);
		
		
	}

}
