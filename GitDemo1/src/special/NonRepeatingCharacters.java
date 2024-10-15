package special;

import java.util.HashMap;	
	
	// Program to Print All Non-Repeating Characters in a String


	public class NonRepeatingCharacters
	
	{
	    public static void main(String[] args) 
	    {
	        String input = "programming";

	        printNonRepeatingCharacters(input);
	    }

	    public static void printNonRepeatingCharacters(String str) {
	        HashMap<Character, Integer> charCount = new HashMap<>();

	        for (char c : str.toCharArray()) {
	            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
	        }

	        for (char c : str.toCharArray()) {
	            if (charCount.get(c) == 1) {
	                System.out.print(c + " ");
	            }
	        }
	    }
	}


