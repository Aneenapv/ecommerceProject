package practice;

	import java.util.Scanner;

	public class StringSubstring {
		
		// Write a program to find if a string is a substring of another string

	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the main string: ");
	        String mainString = scanner.nextLine();
	        
	        System.out.println("Enter the substring: ");
	        String subString = scanner.nextLine();
	        
	        if (mainString.contains(subString)) {
	            System.out.println("The substring is present in the main string.");
	        } else {
	            System.out.println("The substring is not present in the main string.");
	        }
	        scanner.close();
	    }
	}



