package practice;

	import java.util.Scanner;

	public class LengthOfString {
		
		//Write a program to find the length of a string.

	    public static void main(String[] args)
	       {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a string: ");
	        String inputString = scanner.nextLine();
	        
	        int length = inputString.length();
	        System.out.println("The length of the string is: " + length);
	        scanner.close();
	    }
	}



