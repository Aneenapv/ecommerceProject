package practice;

	import java.util.Scanner;

	public class SmallToCapitalCase {

		//Write a program to change all letter from small case to capital case in a string.
		
	    public static void main(String[] args)
	      {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a string: ");
	        String inputString = scanner.nextLine();
	        
	        String upperCaseString = inputString.toUpperCase();
	        System.out.println("The string in uppercase is: " + upperCaseString);
	        scanner.close();
	    }
	}



