package SimpleExample;

import java.util.Scanner;

public class factusingRecursion2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
//		int result;
//		factusingRecursion2 f=new factusingRecursion2();
//		result=f.factor(no);
		
		System.out.println(factor(no));
	}
	static int factor(int i)
	{
		if(i>=1)
		{
			return(i*factor(i-1));
			 
		}
		return 1;
		
	}

}
