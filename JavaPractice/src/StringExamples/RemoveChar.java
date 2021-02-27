package StringExamples;

public class RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="This is Demo";
//		str=str.replace("is","was"); // Replace all occurances
		str=str.replaceFirst("is","was");//Replace first Occurance of substring
//		str=str.replaceAll("is", "was");// Repalce all Occurances also provides Regular expression
//		str=str.replaceAll("is(.)", "was");
//		str=str.replaceAll("is(.*)", "was");
		System.out.println(str);
//		
		
//		String str1=new String("my is name is pravin");
//		str1=str1.replaceFirst("is","was");
//		System.out.println(str1);
	}

	

}
