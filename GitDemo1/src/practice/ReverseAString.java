package practice;

	import java.util.Scanner;

	public class ReverseAString { 
		
		// Write a program to reverse a string and check if it is a palindrome.

	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a string: ");
	        String originalString = scanner.nextLine();
	        
	        // Reverse the string
	        String reversedString = new StringBuilder(originalString).reverse().toString();
	        
	        // Check if the original string is equal to the reversed string
	        if (originalString.equalsIgnoreCase(reversedString)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }

	        scanner.close();
	    }
	}



