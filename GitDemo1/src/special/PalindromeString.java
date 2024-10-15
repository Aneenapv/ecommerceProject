package special;
import java.util.Scanner;
public class PalindromeString 
{
	// Program to Check if a Given Input is Palindrome

	    public static void main(String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a string: ");
	        String input = scanner.nextLine();

	        if (isPalindrome(input)) {
	            System.out.println("The input is a palindrome.");
	        } else {
	            System.out.println("The input is not a palindrome.");
	        }
	    }

	    public static boolean isPalindrome(String str) {
	        int left = 0;
	        int right = str.length() - 1;

	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }

	        return true;
	    }
	}

