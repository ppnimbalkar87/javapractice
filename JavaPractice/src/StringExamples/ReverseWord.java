package StringExamples;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		ReverseWords(str);

	}

	private static void ReverseWords(String str) 
	{
		String[] Words=str.split(" ");
		String Reverstring="";
		
		for(int i=0;i<Words.length;i++)
		{
			String word=Words[i];
			String revWord="";
			for(int j=word.length()-1;j>=0;j--)
			{
				revWord=revWord+word.charAt(j);
			}
			Reverstring=Reverstring+revWord+" ";
		}
		System.out.println("Original String is- "+str);
		System.out.println("String after reversing words- "+Reverstring);
	}

}
