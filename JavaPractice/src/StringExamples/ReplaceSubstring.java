package StringExamples;

public class ReplaceSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="India my is my Country";
		System.out.println(removeCharAt(str,3));
	}

	private static String removeCharAt(String str, int pos) {
		// TODO Auto-generated method stub
		return (str.substring(0,pos)+str.substring(pos+1));
	}
	

}
