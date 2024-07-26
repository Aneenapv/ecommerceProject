package practice;

import java.util.Arrays;
import java.util.Collections;

public class ArrayInDescending {
		
		public static void main(String[] args) {
	        
			Integer[] numbers = {4,6,1,7,9,3,8};
			

	        // Sort the array in descending order using Arrays.sort with Collections.reverseOrder
	        Arrays.sort(numbers, Collections.reverseOrder());

	        // Print the sorted array
	        System.out.println("Numbers in descending order:");
	        
	        //for(int i=0;i<numbers.length;i++)
	        	//or use for each loop
	        for (int number : numbers)
	        {
	           // System.out.print(numbers[i] + " ");
	            System.out.println(number + " ");
	        }
	 

		}

	}




