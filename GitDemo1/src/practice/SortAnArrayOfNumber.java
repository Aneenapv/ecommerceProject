package practice;
	
	import java.util.Arrays;
	import java.util.Scanner;

	public class SortAnArrayOfNumber {

		//Write a program to sort an array of numbers.
	

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
	        
	        Arrays.sort(array);
	        
	        System.out.println("The sorted array is: ");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	        scanner.close();
	    }
	}



