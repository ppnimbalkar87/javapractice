package SimpleExample;

public class RuntimePoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A obj1=new A();
//		B obj2=new B();
		A obj1=new B();
		obj1.show();
	}

}

class A
{
	public void show() {
		System.out.println("In show A");
	}
}

class B extends A
{
	public void show() {
		System.out.println("In show B");
	}
}
