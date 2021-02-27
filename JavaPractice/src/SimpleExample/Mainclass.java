package SimpleExample;

class Vehicle {
	public static void run() {
		System.out.println("Vehicle is running");
	}
}

class Bike extends Vehicle {
	public static void run() {
		System.out.println("Bike is running ");
	}
}

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike obj = new Bike();
		obj.run();
	}

}
