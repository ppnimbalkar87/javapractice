package patternExamples;

public class Exercise22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=1 && j>=1 && i<n-1 && j<n-1)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			
			System.out.println();
		}
		
			
	}

}
