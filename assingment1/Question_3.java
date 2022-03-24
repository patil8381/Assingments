package assingment1;

import java.util.Arrays;

class Array{
	
	public static int[] copyOf(int[] array) {
		return Arrays.copyOf(array, array.length);
	}
	
}
public class Question_3 {

	public static void main(String[] args) {

		int arr[]= {4,5,6,7,67};
		
		int copyOfArr[]=Array.copyOf(arr);
		
		System.out.println(copyOfArr);
		System.out.println(arr);
	}
}
