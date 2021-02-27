package SimpleExample;

public class swapTwoWithoutThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20,b=30;
		System.out.println("Value of a and b before swaping are "+a+" and "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("Value of a and b after swaping are "+a+" and "+b);

	}

}
