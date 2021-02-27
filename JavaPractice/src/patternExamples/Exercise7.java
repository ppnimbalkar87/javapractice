package patternExamples;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n;
		System.out.println("Enter no of rows");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for (int i=0; i<n; i++) 
        { 
            for(int j=i+1;j<n;j++)
            {
            	System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
            	System.out.print(" *");
            }
            // ending line after each row 
            System.out.println(); 
        } 
		
		for (int i=0; i<n; i++) 
        { 
            for(int j=0;j<2*i-1;j++)
            {
            	System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
            	System.out.print(" *");
            }
            // ending line after each row 
            System.out.println(); 
        } 
			
	}
	
//	public static void main(String[] args) throws Exception {
//		// TODO Auto-generated method stub
//		int n=5;
//		int k=0;
//		for (int i=1; i<=n; i++,k=0) 
//        { 
//            for(int j=1;j<=n-i;j++)
//            {
//            	System.out.print("  ");
//            }
//           while(k!=2*i-1)
//           {
//            System.out.print("* "); 
//            k++;
//           }
//           System.out.println();
//        } 
//			
//	}

}
