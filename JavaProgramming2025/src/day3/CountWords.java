package day3;

public class CountWords {

	public static void main(String[] args) {
		
		String s = "welcome to java selenium testing";
		
		//int count=0;
		
	/*	String a[] = s.split(" ");
		
		 //System.out.println(a[2]);
		 
		 for(String words:a)
		 {
			count = count+1;
			 System.out.print(words+" ");
		 }
		 System.out.println();
		 System.out.println(count); */
		
		
		int count=1;
		
		for(int i=0;i<s.length()-1;i++)
		{
			if((s.charAt(i)==' ')&& (s.charAt(i+1)!=' '))
			{
				count++;
			}
			 
		}
		
		System.out.println(count);

	}

}
