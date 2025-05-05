package stringDemo;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
	
		// immutable - cannot change - string
		// mutable -can change - string builder and string buffer

		
		// mutable can change
		int a[] = {201,4,60,8,10,12,140,16,18,20};
		
		System.out.println(Arrays.toString(a));
		
       Arrays.sort(a);  // this is mutable, change the value of array
       
       System.out.println(Arrays.toString(a));
       
       // immutable
       
       String s = "java";
       
       System.out.println(s);
       s.concat(" python");
       
       System.out.println(s);  // s is immutable , not able to change s value
       
       
       StringBuffer sb = new StringBuffer("first name: ");
       
       sb.append("Aneena");
       
       System.out.println(sb);
       

       StringBuilder sbuild = new StringBuilder("last name: ");
       
       sbuild.append("pv");
       
       System.out.println(sbuild);
       
       

		
		
	}

}
