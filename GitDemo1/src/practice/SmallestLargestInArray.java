package practice;

	import java.util.Scanner;

	public class SmallestLargestInArray {

		// Write a program to find the smallest and largest number in an array.
		
	    public static void main(String[] args)
	      {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the size of the array: ");
	        int size = scanner.nextInt();
	        
	        int[] array = new int[size];
	        System.out.println("Enter the elements of the array: ");
	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.nextInt();
	        }
	        
	        int smallest = array[0];
	        int largest = array[0];
	        
	        for (int num : array) {
	            if (num < smallest) {
	                smallest = num;
	            }
	            if (num > largest) {
	                largest = num;
	            }
	        }
	        
	        System.out.println("The smallest number in the array is: " + smallest);
	        System.out.println("The largest number in the array is: " + largest);
	        scanner.close();
	    }
	}



