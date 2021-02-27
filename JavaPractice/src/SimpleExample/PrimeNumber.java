package SimpleExample;

import java.util.Scanner;

public class PrimeNumber
{

	public static void main(String a[])
	{
		int temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int number=sc.nextInt();
		for(int i=2;i<=number-1;i++)
		{
			if(number%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println("Number "+ number+" is not prime");
		}
		else
		{
			System.out.println("Number "+ number+" is prime");
		}
		
	}
}
