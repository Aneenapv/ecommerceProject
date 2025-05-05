package stringDemo;

import java.util.Arrays;

public class StringsDemoPrograms {

	public static void main(String[] args) {


		String s = "CoreJava";
		
		//String s = new String("CoreJava");
		
		System.out.println(s.length());
		
		//System.out.println(s.toCharArray());
		
		
		System.out.println("output of chararray");
		char a[] = s.toCharArray();
		
		for(int i=0;i<=s.length()-1;i++)
		{
			System.out.println(a[i]);
		}
		
		//concat two strings
		
		System.out.println(s.concat(" with selenium"));
		
		String p = "python";
		
		System.out.println(s.concat(" with selenium ").concat(p));

		String r = "   remove white spaces from this line   ";
		
		System.out.println(r.length());
		
		System.out.println(r.trim().length());
		
		
		System.out.println(s.charAt(3));
		
		System.out.println(s.contains("Co"));
		System.out.println(s.contains("re"));
		System.out.println(s.contains("RE"));
		System.out.println(s.contains("RE".toLowerCase()));

		
		String dup ="aabbccxaabbxcc";
	    //String x = dup.replace('b','x');
		//System.out.println(x.replace('c','z'));
		
		System.out.println(dup.replace('b','x').replace('c','z'));
		
          String[] ar = dup.split("x");
          System.out.println(ar[0]);
          System.out.println(ar[1]);
          System.out.println(ar[2]);
          
          System.out.println(Arrays.toString(ar));
		

		
		
	}

}
