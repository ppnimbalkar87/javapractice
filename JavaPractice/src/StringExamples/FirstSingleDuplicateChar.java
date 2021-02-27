package StringExamples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FirstSingleDuplicateChar {

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
		
		Set<Character> entryset=charCountMap.keySet();
//		System.out.println("Duplicate of character");
		for(Character entry:strarray)
		{
			if(charCountMap.get(entry)==1)
			{
				System.out.println("first single occurance character is "+entry);
				break;
			}
		}
		for(Character entry:strarray)
		{
			if(charCountMap.get(entry)>1)
			{
				System.out.println("first Duplicate occurance character is "+entry);
				break;
			}
			
		}
		
	}

}
