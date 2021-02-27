package SimpleExample;

import java.io.InputStream;
import java.util.Scanner;

public class reverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int remainder,revNo=0;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		System.out.println("Original no is "+no);
		while(no!=0)
		{
			remainder=no%10;
			revNo=revNo*10+remainder;
			no=no/10;
		}
		System.out.println("Reverse no is "+revNo);
	}

}
