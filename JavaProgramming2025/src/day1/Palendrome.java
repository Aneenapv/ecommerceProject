package day1;

public class Palendrome {

	public static void main(String[] args) {
		
		int num = 123321;
		int n = num;
		int rev=0;
		
		while(num>0)
		{
		int rem = num%10;
		rev = rev*10 + rem;
		num = num/10;
		}
		
		if(rev == n)
		{
			System.out.println("number is palendrome");
		}
		else
		{
			System.out.println("number is not palendrome");
		}
		

	}

}

