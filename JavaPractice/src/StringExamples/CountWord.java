package StringExamples;

import java.util.Scanner;

public class CountWord {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("Enter the string");
//		Scanner sc=new Scanner(System.in);
//		String str=sc.nextLine();
//		String[] words=str.split(" ");
//		System.out.println("No of words in String= "+words.length);
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
//		String[] words=str.split(" ");
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("No of words in String= "+count);
	}

}
