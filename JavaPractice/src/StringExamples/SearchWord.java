package StringExamples;

public class SearchWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="india is my country";
		
//1.		System.out.println(str.contains("y c"));
		
		int index=str.indexOf("my");
		if(index==-1)
			System.out.println("not found");
		else
			System.out.println("Found at index "+index);

	}

}
