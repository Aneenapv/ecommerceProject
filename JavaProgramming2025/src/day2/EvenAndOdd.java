package day2;

public class EvenAndOdd {

	public static void main(String[] args) {
	
		int a[] = { 1,2,3,4,5,6,7,8,9,10};
		int evencount=0;
		int oddcount=0;
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("even number "+a[i]);
				evencount= evencount+1;
			}
			else
			{
				System.out.println("odd number "+a[i]);
				oddcount = oddcount+1;
			}
		}
		
		System.out.println("count= "+evencount);
		System.out.println("count= "+oddcount);
		

	}

}
