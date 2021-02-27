package patternExamples;

public class Exercise5 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int row=5;
//		for(int i=0;i<row;i++)
//		{
//			for(int j=row;j>i;j--)
//			{
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//			
//	}

	public static void main(String[] args)
	{
		int row=5;
		for(int i=row;i>=0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}
