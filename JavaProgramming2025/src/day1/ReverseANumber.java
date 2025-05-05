package day1;

public class ReverseANumber {
	
	public static void main(String args[])
	{
		
	/*	int num = 1234;
		
		while(num!=0)
		{
		r = num%10;
		System.out.print(r);
		num = num/10;
		}   */
		
		
   /*	int num = 1234;
		int rev = 0;
		
		while(num>0)
		{
			int rem = num%10;
			rev = rev*10 + rem;
			num = num/10;
			
		}
		
		System.out.println(rev);  */
		
		
		
		int num = 1234;
		int rev=0;
		do
		{
			int rem = num %10;
			rev = rev*10 + rem;
			num = num/10;
		} 
		while(num>0);
			
		System.out.println(rev);
		
	}

}
