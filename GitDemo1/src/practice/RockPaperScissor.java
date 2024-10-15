package practice;
	
	//Write a program to write Rock, Paper, Scissors game in Java.
	
	import java.util.Random;
	import java.util.Scanner;

	public class RockPaperScissor {

	    public static void main(String[] args) 
	       {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        String[] choices = {"Rock", "Paper", "Scissors"};
	        
	        System.out.println("Enter your choice (Rock, Paper, Scissors): ");
	        String userChoice = scanner.nextLine();
	        
	        int computerChoiceIndex = random.nextInt(3);
	        String computerChoice = choices[computerChoiceIndex];
	        
	        System.out.println("Computer's choice: " + computerChoice);
	        
	        if (userChoice.equalsIgnoreCase(computerChoice)) 
	        {
	            System.out.println("It's a tie!");
	        }
	        else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
	                   (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock")) ||
	                   (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper"))) 
	        {
	            System.out.println("You win!");
	        }
	        else 
	        {
	            System.out.println("You lose!");
	        }
	        scanner.close();
	    }
	}


