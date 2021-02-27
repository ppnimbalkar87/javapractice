package SimpleExample;

import java.util.Scanner;

public class PrimeNumber2
{

	public static void main(String a[])
	{
		int temp=0;
		int count=0;
		
		for(int j=1;j<=100;j++)
		{
			for(int i=2;i<=j-1;i++)
			{
				if(j%i==0)
				{
					temp=temp+1;
				}
			}
			if(temp>0)
			{
				temp=0;
			}
			else
			{
				count++;
				System.out.println("Number "+ j+" is prime");
			}
		}
		System.out.println(" Total prime numbers between 1 to 100 are "+count);
		
	}
}
