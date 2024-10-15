package abstraction;

public class GoogleMain{

	public static void main(String[] args) {
	
		GoogleSearch gs = new GoogleSearch();
		gs.message();
		gs.search();
		
		GoogleImage gi = new GoogleImage();
		gi.message();
		gi.search();

	}

}
