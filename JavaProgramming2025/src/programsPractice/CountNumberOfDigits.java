package programsPractice;

public class CountNumberOfDigits {
	
	public static void main(String[] args)
	{
		int num = 123456;
		int count =0;
		
		while(num>0)
		{
			num = num/10;
			count = count+1;
		}
		
		System.out.println(" number of digits = "+count);
	}

}
