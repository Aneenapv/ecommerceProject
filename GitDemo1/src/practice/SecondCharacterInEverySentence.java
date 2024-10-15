package practice;

	//Write a program to remove the second character of every word in a sentence.
	
	import java.util.Scanner;

	public class SecondCharacterInEverySentence {

	    public static void main(String[] args) 
	      {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a sentence: ");
	        String sentence = scanner.nextLine();
	        
	        String[] words = sentence.split(" ");
	        StringBuilder result = new StringBuilder();
	        
	        for (String word : words) {
	            if (word.length() > 1) {
	                result.append(word.charAt(0)).append(word.substring(2)).append(" ");
	            } else {
	                result.append(word).append(" ");
	            }
	        }
	        
	        System.out.println("The modified sentence is: " + result.toString().trim());
	        scanner.close();
	    }
	}


