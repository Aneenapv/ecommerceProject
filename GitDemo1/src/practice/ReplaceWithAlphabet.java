package practice;

	import java.util.Scanner;
	
	public class ReplaceWithAlphabet {
		
		//Write a program to replace the numbers in an array with alphabets.

	    public static void main(String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);
	        //System.out.println("Enter the size of the array: ");
	        //int size = scanner.nextInt();
	        
	        int[] array = new int[5];
	        System.out.println("Enter the elements of the array (0-25): ");
	        for (int i = 0; i <5; i++) 
	        {
	            array[i] = scanner.nextInt();
	        }
	        
	        System.out.println("The array with numbers replaced by alphabets is: ");
	        for (int num : array) {
	            char alphabet = (char) ('A' + num);
	            System.out.print(alphabet + " ");
	        }
	        scanner.close();
	    }
	}



