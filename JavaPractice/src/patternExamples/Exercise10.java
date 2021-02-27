package patternExamples;

public class Exercise10 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int rows = 9, k = 0;

		for (int i = 1; i <= rows; i++) 
		{
			for (int j = 2*(rows-i); j >=0; j--) 
			{
				System.out.print(" ");
			}
			for (int j = 0; j <i; j++) 
			{
				System.out.print(" *");
			}
			
			
			System.out.println();
		}

	}

}


