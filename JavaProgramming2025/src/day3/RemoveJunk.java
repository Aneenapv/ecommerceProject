package day3;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s = "we00lco$m^eZ";
		
		s=s.replaceAll("[^a-zA-Y]","");

		System.out.println("After removing junk : "+s);
	}

}
