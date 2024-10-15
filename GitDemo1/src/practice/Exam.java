package practice;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		
		Integer[] array = {1,2,4,4,5,6,7,7,9,7};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		Integer num = sc.nextInt();
		
		
		int count=0;
		
		for(int i=0; i<array.length;i++)
		{
			if(array[i]==num)
			{
				count++;
			}		
		}
		System.out.println("Number "+num+" is " +count+" times in array ");	

	}

}
