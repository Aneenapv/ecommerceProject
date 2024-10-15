package practice;

	// Write a program to check whether a number is positive or negative.
	
	 import java.util.Scanner;

	 public class NumberIsPositiveOrNegative {

	     public static void main(String[] args) {
	         Scanner scanner = new Scanner(System.in);
	         System.out.println("Enter a number: ");
	         double number = scanner.nextDouble();
	         
	         if (number > 0) {
	             System.out.println(number + " is positive.");
	         } else if (number < 0) {
	             System.out.println(number + " is negative.");
	         } else {
	             System.out.println(number + " is zero.");
	         }
	         scanner.close();
	     }
	 }

