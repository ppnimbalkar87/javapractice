package SimpleExample;

class Vehicle1 {
	void run1() {
		System.out.println("Vehicle is running");
	}
}

class Bike1 extends Vehicle1 {
	void run1(){
//		super.run();
		System.out.println("Bike is running ");
	}
}

public class Mainclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle1 obj = new Bike1();
		obj.run1();
	}

}
