package StringExamples;
//
//import java.util.Scanner;
//
//public class Intersection {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner s=new Scanner(System.in);
//		System.out.print(Findinresection(s.nextLine()));
//	}
//
//	public static String Findinresection(String[] str) {
//		// TODO Auto-generated method stub
//		
//		return str[0];
//	}
//
//}


import java.util.*; 
import java.io.*;

class Intersection {

  public static String FindIntersection(String[] strArr) {
    String[] a =strArr[0].split(", ");
    String[] b =strArr[1].split(", ");
    String s="";
    for(int i=0; i<a.length; i++)
      for(int j=0; j<b.length;j++)
        if(a[i].equals(b[j]))
          s=s+a[i]+",";
    if(s.length()>1)
    return s.substring(0, s.length()-1);
    else
    return"false";
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    String str=s.nextLine();
//    System.out.print(FindIntersection(str)); 
  }

}
