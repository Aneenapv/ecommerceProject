package programsPractice;

public class PalendromeNumberOrNot {
	
	public static void main(String[] args)
	{
		int num = 12321;
		int pal=num;
		int remainder = 0;
		int reverse=0;
		
		while(num>0)
		{
			remainder = num%10;
			reverse = reverse*10 + remainder;
			num = num/10;
		}
		if(reverse==pal)
		{
			System.out.println("number is palendrome");
		}
		else
		{
			System.out.println("not palendrome");
		}
	}

}
