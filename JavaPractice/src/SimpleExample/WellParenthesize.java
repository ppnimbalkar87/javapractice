package SimpleExample;

import java.util.Scanner;
import java.util.Stack;

public class WellParenthesize
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = sc.nextLine();
		if(checkParenthesis(str))
		{
			System.out.println("String is well parenthesize");
		}
		else
		{
			System.out.println("String is not well parenthesize");
		}
	}

	private static boolean checkParenthesis(String str)
	{
		// TODO Auto-generated method stub

		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i <= str.length() - 1; i++) 
		{

			switch (str.charAt(i)) 
			{
			case '(': 
//					{
//				st.push(str.charAt(i));
//				break;
//					}
			case '[': 
//					{
//				st.push(str.charAt(i));
//				break;
//					}
			case '{': {
				st.push(str.charAt(i));
				break;
					}
			case ')': {
						if(st.empty()||!st.pop().equals('('))
							{
								return false;
							}
						break;
					  }
			case ']': {
						if(st.empty()||!st.pop().equals('['))
							{
								return false;
							}
						break;
					  }
			case '}': {
						if(st.empty()||!st.pop().equals('{'))
							{
								return false;
							}
						break;
					  }
			
			}
		}
		return st.isEmpty();
	}

}
