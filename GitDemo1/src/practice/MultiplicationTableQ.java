package practice;


	//Write a program to generate a multiplication table.
	
	import java.util.Scanner;

	public class MultiplicationTableQ {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a number: ");
	        int number = scanner.nextInt();
	        
	        System.out.println("Multiplication table for " + number + ":");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(number + " x " + i + " = " + (number * i));
	        }
	        scanner.close();
	    }
	}


