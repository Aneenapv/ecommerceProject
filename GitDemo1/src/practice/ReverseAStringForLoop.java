package practice;
	
	// Write a program to reverse a string with a for loop.
	
	 import java.util.Scanner;

	 public class ReverseAStringForLoop {

	     public static void main(String[] args) 
	        {
	         Scanner scanner = new Scanner(System.in);
	         System.out.println("Enter a string: ");
	         String originalString = scanner.nextLine();
	         
	         String reversedString = "";
	         for (int i = originalString.length() - 1; i >= 0; i--)
	         {
	             reversedString += originalString.charAt(i);
	         }
	         
	         System.out.println("The reversed string is: " + reversedString);
	         scanner.close();
	     }
	 }


