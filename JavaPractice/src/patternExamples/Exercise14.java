package patternExamples;

public class Exercise14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<=n;++i)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(" *");
			}
			
			System.out.println();
		}
		
//		for(int i=0;i<=n;++i)
//		{
//			for(int j=n;j>=1;j--)
//			{
//				if(j>i)
//				{
//					System.out.print(" ");
//				}
//				else
//				{
//					System.out.print(" *");
//				}
//			}
//			
//			System.out.println();
//		}
			
			
	}

}
