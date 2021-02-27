package StringExamples;

public class split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="india is my county";
//		String[] words=str.split("\\s"); //split by space
//		String[] words=str.split("\\h");
		String[] words=str.split(" ");
		for(String w:words)
		{
			System.out.println(w);
		}

	}

}
