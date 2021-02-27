package SimpleExample;

public class factorial {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int no=5;
//		int fact=1;
//		for(int i=1;i<=no;i++)
//		{
//			fact=fact*i;
//		}
//		System.out.println("Factorial of "+no+" is "+fact);
//	}

//	OR
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int no=6;
//		int fact=1;
//		for(int i=no;i>=1;i--)
//		{
//			fact=fact*i;
//		}
//		System.out.println("Factorial of "+no+" is "+fact);
//	}

	public static void main(String[] args) {
		int no = 5;
		int fact=factorial(no);
		System.out.println(fact);
	}

	private static int factorial(int i) {

		int fact=1;
		while(i>0)
		{
			fact=fact*i;
			i--;
		}
		return fact;
		
	}

}
