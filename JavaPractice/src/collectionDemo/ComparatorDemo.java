package collectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> values=new ArrayList<Integer>();
		values.add(456);
		values.add(842);
		values.add(951);
		values.add(324);
		values.add(746);
		values.add(564);
		
		
//		Comparator<Integer> comp=new Comparator<Integer>()
//		{
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				if(o1%10>o2%10)
//					return 1;
//				return -1;
//			}
//		};	
		
//		OR
		
//		Comparator<Integer> comp=(Integer o1, Integer o2)-> {
//				if(o1%100>o2%100)
//					return 1;
//				return -1;
//			};
		
//		OR
		
		
//		Descending Order
		Comparator<Integer> comp=(o1,o2)-> {
			return o1%10<o2%10?1:-1;
		};
			
			
			
		Collections.sort(values,comp);
		
		
		
		
		System.out.println();
		for(Integer i:values)
		{
			System.out.println(i);
		}	
	}

}
