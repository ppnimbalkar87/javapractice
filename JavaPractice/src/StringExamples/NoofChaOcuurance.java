package StringExamples;

import java.util.Scanner;

public class NoofChaOcuurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		int count=str.replace("p", "").length();
		System.out.println("No of occurances of char p in String= "+count);
	}
}
