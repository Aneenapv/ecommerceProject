package practice;

import java.util.Scanner;

public class PrimeOrNot {
	

			  public static void main(String[] args) {
				  
				  Scanner sc = new Scanner(System.in);
				  System.out.println("Enter a number = ");
		          int num = sc.nextInt();
		          
		          if(num>1)
		          {
		         
			    boolean flag = false;
			    for (int i = 2; i <= num / 2; ++i) 
			    {
			      // condition for nonprime number
			      if (num % i == 0) 
			      {
			        flag = true;
			        System.out.println(num + " is not a prime number.");
			        break;
			      }
			    }

			    if (!flag)
			      System.out.println(num + " is a prime number.");
			    
			   
			  }
		          else
		          {
				     System.out.println(num + " is not a prime number.");
		          
			     }
			  }
}