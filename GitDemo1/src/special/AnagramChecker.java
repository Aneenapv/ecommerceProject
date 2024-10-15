package special;

import java.util.Arrays;

public class AnagramChecker {
	
	// Program to Check if Two Strings are Anagrams


	    public static void main(String[] args) {
	        String str1 = "listen";
	        String str2 = "silent";

	        if (areAnagrams(str1, str2)) {
	            System.out.println("The strings are anagrams.");
	        } else {
	            System.out.println("The strings are not anagrams.");
	        }
	    }

	    public static boolean areAnagrams(String str1, String str2) {
	        if (str1.length() != str2.length()) {
	            return false;
	        }

	        char[] charArray1 = str1.toCharArray();
	        char[] charArray2 = str2.toCharArray();

	        Arrays.sort(charArray1);
	        Arrays.sort(charArray2);

	        return Arrays.equals(charArray1, charArray2);
	    }
	}


