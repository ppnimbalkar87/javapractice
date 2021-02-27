package SimpleExample;

import java.io.BufferedReader;
import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {

//		Scanner sc=new Scanner(System.in);
//		String str=sc.nextLine();
		String str="Pravin";
		strReverse(str);
		
	}
	public static void strReverse(String str)
	{
		String rev="";
//		char revstr[]=str.toCharArray();
		System.out.println("Reverse string is");
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
//			System.out.print(revstr[i]);
		}
		System.out.print(rev);
	}

}
