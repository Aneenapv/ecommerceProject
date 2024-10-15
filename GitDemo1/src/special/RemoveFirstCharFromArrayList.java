package special;
import java.util.ArrayList;
import java.util.Arrays;
public class RemoveFirstCharFromArrayList {
	
	// Program to Remove First Character from Every Element in an Array List

	    public static void main(String[] args) 
	    {
	        ArrayList<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry"));
	        removeFirstCharacter(list);

	        System.out.println(list);
	    }

	    public static void removeFirstCharacter(ArrayList<String> list) {
	        for (int i = 0; i < list.size(); i++) {
	            list.set(i, list.get(i).substring(1));
	        }
	    }
	}


