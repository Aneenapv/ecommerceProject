package programsPractice;

public class CountNumberOfEvenAndOdd {
	
	public static void main(String[] args)
	{
		int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12};
		int count_even=0;
		int count_odd=0;
		
		for(int i=0;i<nums.length-1;i++)
		{
			if(nums[i]%2==0)
			{
				count_even = count_even+1;
			}
			else
			{
				count_odd =count_odd+1;
				
			}
		}
		
		System.out.println("number of even:"+count_even);
		System.out.println("number of odd: "+count_odd);
		
		
	}

}
