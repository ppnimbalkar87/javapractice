package SimpleExample;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray= {15,25,14,47,65,23,48,95,78,12,22};
		String[] strArray= {"java","python","c","selenium","pravin","sonali","c#","r","cpp"};
		
		System.out.println("Original Int array "+Arrays.toString(intArray));
		Arrays.sort(intArray);
		System.out.println("Original Int array "+Arrays.toString(intArray));
		
		System.out.println("Original Int array "+Arrays.toString(strArray));
		Arrays.sort(strArray);
		System.out.println("Original Int array "+Arrays.toString(strArray));

	}

}
