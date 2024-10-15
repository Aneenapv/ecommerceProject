package practice;


import java.util.Scanner;

public class ReplaceTwoNumberWithoutVariable {

	//Write a program to replace 2 numbers without using a third variable.
	
	    public static void main(String[] args) 
	    
	       {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter first number: ");
	        int a = scanner.nextInt();
	        
	        System.out.println("Enter second number: ");
	        int b = scanner.nextInt();
	        
	        System.out.println("Before swapping: a = " + a + ", b = " + b);
	        
	        // Swap without third variable
	        a = a + b;
	        b = a - b;
	        a = a - b;
	        
	        System.out.println("After swapping: a = " + a + ", b = " + b);
	        scanner.close();
	    }
	}



