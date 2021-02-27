package StringExamples;

public class LastIndexofSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="India my is my Country";
		int lindex=str.lastIndexOf("n");
		if(lindex==-1)
			System.out.println("string not found");
		else
			System.out.println("lasts index pof substring is "+lindex);
	}

}
