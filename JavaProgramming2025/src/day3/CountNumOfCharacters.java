package day3;

import java.util.Scanner;

public class CountNumOfCharacters {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String s = sc.nextLine();
		
		//System.out.println(s.length());
		
		
		int count=0;
		
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(s.charAt(i)==s.charAt(j+1))
						{
					  count ++;
						}
			}
			System.out.println("count of :"+s.charAt(i)+"= "+count);
		}
	
		
		

	}

}
