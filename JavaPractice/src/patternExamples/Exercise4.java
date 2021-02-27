package patternExamples;



public class Exercise4 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		char last='E',alpha='A';
//		for(int i=1;i<=(last-'A'+1);i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(" "+alpha);
//			}
//			System.out.println();
//			alpha++;
//		}
//			
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alpha=65;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+(char)alpha);
			}
			System.out.println();
			alpha++;
		}
			
	}
	

}
