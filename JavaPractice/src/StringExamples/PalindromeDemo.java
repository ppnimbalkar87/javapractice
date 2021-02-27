package StringExamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeDemo {
	/**
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		String str;
		String rev;
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			str = br.readLine();
			rev = "";
			for(int i=str.length()-1;i>=0;i--)
			{
				rev=rev+str.charAt(i);
			}
			if(str.equals(rev))
			{
				System.out.println("String is pallindrome");
			}
			else
			{
				System.out.println("String is not pallindome");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to rwad string "+e.getMessage());
		}
		
	}

}
