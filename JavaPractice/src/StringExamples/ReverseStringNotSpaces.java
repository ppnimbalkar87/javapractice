package StringExamples;

import java.util.Scanner;

public class ReverseStringNotSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		ReverseString(str);
	}

	private static void ReverseString(String str)
	{
		char[] ostr = str.toCharArray();
		char[] revstr = new char[ostr.length];
		for (int i = 0; i < ostr.length; i++)
		{
			if (ostr[i] == ' ') 
			{
				revstr[i] = ' ';
			}
		}

		int j = ostr.length - 1;
		for (int i = 0; i < ostr.length; i++)
		{
			if (ostr[i] != ' ') 
			{
				if (ostr[j] == ' ')
				{
					j--;
				}

				revstr[j] = ostr[i];
				j--;

			}
		}
		System.out.println(str + "--->" + String.valueOf(revstr));

	}

}
