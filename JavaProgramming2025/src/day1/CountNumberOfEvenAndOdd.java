package day1;

public class CountNumberOfEvenAndOdd {

	public static void main(String[] args) {
		
		int num = 123456789;
		
		while(num>0)
		{
		int rem = num%10;
		if(rem%2==0)
		{
			System.out.println(rem+ " even");
		}
		else
		{
			System.out.println(rem + " odd");
		}
		num = num/10;
		}
		
		

	}

}
