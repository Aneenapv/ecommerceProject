package practice;

	//Write a program to calculate the sum of natural numbers.
	
	import java.util.Scanner;

	public class SumOfNaturalNumbers {

	    public static void main(String[] args) 
	       {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a number: ");
	        int number = scanner.nextInt();
	        
	        int sum = 0;
	        for (int i = 1; i <= number; i++) {
	            sum += i;
	        }
	        
	        System.out.println("The sum of the first " + number + " natural numbers is: " + sum);
	        scanner.close();
	    }
	}


