package StringExamples;

import java.io.BufferedReader;

import java.io.InputStreamReader;

public class StrIsNumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter the string");
		String str="565547";
//		String[] abc= {"1,3,2,4","3,4,5,2"};
		boolean numeric=true;
		try
		{
			double num=Double.parseDouble(str);
		}catch(NumberFormatException e)
		{
			numeric=false;
		}
		
		if(numeric)
			System.out.println("String is numeric");
		else
			System.out.println("String is not numeric");
	}

}
