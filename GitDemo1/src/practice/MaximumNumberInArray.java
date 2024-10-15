package practice;

public class MaximumNumberInArray {

	public static void main(String[] args) {
        
		Integer[] a = {4,6,1,7,9,3,8};
		
		int max = a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
			
		}
		
		System.out.println("maximum number is ="+max);
 

	}

}

