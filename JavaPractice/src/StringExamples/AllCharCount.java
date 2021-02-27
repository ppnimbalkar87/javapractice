package StringExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AllCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.replaceAll("\\s", "");
	
		charCountInString(str);

	}

	private static void charCountInString(String str)
	{
		Map<Character, Integer> charCountMap=new HashMap<Character, Integer>();
		
		char[] strarray=str.toCharArray();
		for(char c:strarray)
		{
			if(charCountMap.containsKey(c))
			{
				charCountMap.put(c, charCountMap.get(c)+1);
			}
			else
			{
				charCountMap.put(c, 1);
			}
		}
		System.out.println(str+" : "+charCountMap);
		
		Set<Map.Entry<Character, Integer>> entryset=charCountMap.entrySet();
		System.out.println("Occurances of character");
		for(Map.Entry<Character, Integer> entry:entryset)
		{
			System.out.println(entry.getKey()+" occurs "+entry.getValue()+" times in string");
		}
		
	}

}
