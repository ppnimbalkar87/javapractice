package patternExamples;

public class Exercise15
{

//	public static void main(String[] args) 
//	{
//		// TODO Auto-generated method stub
//		int n=5;
//		for(int i=0;i<=n;++i)
//		{
//			for(int j=n;j>=i;j--)
//			{
//				System.out.print(" ");
//			}
//			for(int j=0;j<=i;j++)
//			{
//				System.out.print("*");
//			}
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<(2*i);j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
