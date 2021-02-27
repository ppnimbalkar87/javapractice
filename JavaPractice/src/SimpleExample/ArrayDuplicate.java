package SimpleExample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray= {15,25,14,25,47,14};
		
		Set<Integer> dup=new HashSet<>();
		
		for(int i:intArray)
		{
			if(dup.add(i)==false)
			System.out.println(i);
		}
		

	}

}
