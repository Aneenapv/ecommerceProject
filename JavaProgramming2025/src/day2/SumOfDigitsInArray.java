package day2;

public class SumOfDigitsInArray {
	
	public static void main(String args[])
	{
		int a[] = {1,2,3,4,5};
		int sum = 0;
		
	/* using for loop
		for(int i=0; i<=a.length-1;i++)
		{
			sum = sum + a[i];
		}
		System.out.println("sum of digits= "+sum);  */
		
		for(int x:a)
		{
			sum = sum +x;
		}
		System.out.println("sum = "+sum);
	}

}
