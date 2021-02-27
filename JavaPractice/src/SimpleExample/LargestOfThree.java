package SimpleExample;

public class LargestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100,b=23,c=115;
		
		if(a>b)
		{
			if(a>c)
				System.out.println("a is greter");
			else
				System.out.println("C is grater");
		}
		else if(b>a)
		{
			if(b>c)
				System.out.println("b is greater");
			else
				System.out.println("c is greater");
		}
		
	}

}
