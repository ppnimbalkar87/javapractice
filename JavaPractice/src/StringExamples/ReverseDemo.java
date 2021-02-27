package StringExamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class ReverseDemo {
	/**
	 * 
	 * 
	 * @param args
	 * @throws Exception 
	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String str="pravin";
//		String rev="";
//		for(int i=str.length()-1;i>=0;i--)
//		{
//			rev=rev+str.charAt(i);
//		}
//		System.out.println("Original String is "+str);
//		System.out.println("Reverse sring is "+rev);
//	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Original String is "+str);
		System.out.println("Reverse sring is "+rev);
	}

}
