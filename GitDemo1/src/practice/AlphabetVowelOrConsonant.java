package practice;

	//Write a program to check whether an alphabet is a vowel or consonant.

	import java.util.Scanner;

	public class AlphabetVowelOrConsonant {

	    public static void main(String[] args)
	      {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter an alphabet: ");
	        char ch = scanner.next().charAt(0);
	        
	        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
	            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
	        {
	            System.out.println(ch + " is a vowel.");
	        } 
	        else 
	        {
	            System.out.println(ch + " is a consonant.");
	        }
	        scanner.close();
	    }
	}


