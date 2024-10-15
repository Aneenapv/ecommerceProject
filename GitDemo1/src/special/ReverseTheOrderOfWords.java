package special;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseTheOrderOfWords {
	
	// Reverse the Order of Words in Each Line of Input, Keeping the First and Last Word in Their Original Position

	    public static void main(String[] args) 
	    {
	        Scanner scanner = new Scanner(System.in);
	        int N = scanner.nextInt();
	        scanner.nextLine(); // Consume newline

	        List<String> lines = new ArrayList<>();
	        for (int i = 0; i < N; i++) {
	            lines.add(scanner.nextLine());
	        }

	        for (String line : lines) {
	            System.out.println(reverseWords(line));
	        }
	    }

	    public static String reverseWords(String line) {
	        String[] words = line.split(" ");
	        if (words.length <= 2) {
	            return line;
	        }

	        StringBuilder sb = new StringBuilder();
	        sb.append(words[0]).append(" ");

	        for (int i = words.length - 2; i > 0; i--) {
	            sb.append(words[i]).append(" ");
	        }

	        sb.append(words[words.length - 1]);
	        return sb.toString().trim();
	    }
	}


