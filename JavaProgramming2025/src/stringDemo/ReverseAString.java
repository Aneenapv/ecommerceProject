package stringDemo;

public class ReverseAString {

	public static void main(String[] args) {


		String s = "I love Java";
		String rev="";
		String pal="";
		
		char ar[] = s.toCharArray();
		
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev+ar[i];
		}
		
		System.out.println(rev);
		
		
		//or
		
		for(int j=s.length()-1;j>=0;j--)
		{
			pal = pal +s.charAt(j);
		}

		System.out.println(pal);
		
		
		// string buffer
		
		StringBuffer sb = new StringBuffer("welcome");
		System.out.println(sb.reverse());
		
		// string builder
		
		StringBuilder sbuild = new StringBuilder("postman api");
		
		System.out.println(sbuild.reverse());
		
		
		// immutable - cannot change - string
		// mutable -can change - string builder and string buffer
		
		
		
		
	}

}
