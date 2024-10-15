package practice;


	
	//Write a program to find if an array is a mountain array or not.
	
	import java.util.Scanner;

	public class MountainArrayOrNot {

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
	        
	        if (isMountainArray(array)) {
	            System.out.println("The array is a mountain array.");
	        } else {
	            System.out.println("The array is not a mountain array.");
	        }
	        scanner.close();
	    }

	    public static boolean isMountainArray(int[] arr) {
	        if (arr.length < 3) {
	            return false;
	        }
	        
	        int i = 0;
	        // walk up
	        while (i + 1 < arr.length && arr[i] < arr[i + 1]) {
	            i++;
	        }
	        
	        // peak can't be first or last
	        if (i == 0 || i == arr.length - 1) {
	            return false;
	        }
	        
	        // walk down
	        while (i + 1 < arr.length && arr[i] > arr[i + 1]) {
	            i++;
	        }
	        
	        return i == arr.length - 1;
	    }
	}


