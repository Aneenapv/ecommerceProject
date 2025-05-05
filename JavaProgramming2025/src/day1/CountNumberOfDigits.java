package day1;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		
		long num = 12345678123L;
		int count=0;
		
		while(num>0)
		{
			num = num/10;
			count = count+1;
		}
		System.out.println(count);

	}

}
