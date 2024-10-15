package practice;

	//Write a program to calculate the power of a number.
	
	import java.util.Scanner;

	public class PowerOfANumber {

	    public static void main(String[] args) 
	       {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the base: ");
	        double base = scanner.nextDouble();
	        
	        System.out.println("Enter the exponent: ");
	        int exponent = scanner.nextInt();
	        
	        double result = Math.pow(base, exponent);
	        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
	        scanner.close();
	    }
	}


