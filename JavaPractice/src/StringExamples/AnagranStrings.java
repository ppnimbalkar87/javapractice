package StringExamples;

import java.util.Arrays;
import java.util.Scanner;

public class AnagranStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string");
		String str1 = sc.nextLine();
		System.out.println("Enter the second string");
		String str2 = sc.nextLine();
		isAnagram(str1,str2);
	}

	private static void isAnagram(String str1, String str2) {
		String copyOfstr1=str1.replaceAll("\\s", "");
		String copyOfstr2=str2.replaceAll("\\s", "");
		boolean status=false;
		if(copyOfstr1.length()!=copyOfstr2.length())
		{
			status=false;
//			
		}
		else
		{
			char[] s1Array=copyOfstr1.toLowerCase().toCharArray();
			char[] s2Array=copyOfstr2.toLowerCase().toCharArray();
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			System.out.println(s1Array);
			System.out.println(s2Array);
			if(Arrays.equals(s1Array, s2Array))
			{
				status=true;
			}
		}
		if(status)
			System.out.println("Strings are Anagram");
		else
			System.out.println("Strings are not Anagram");
		
		
	}

}
