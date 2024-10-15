package special;
import java.util.Arrays;
import java.util.LinkedHashSet;
public class RemoveDuplicatesInArray {
	
	// Program to Remove Duplicate Elements in an Array

	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 2, 4, 3, 5, 1};
	        int[] uniqueArray = removeDuplicates(array);

	        System.out.println(Arrays.toString(uniqueArray));
	    }

	    public static int[] removeDuplicates(int[] array) {
	        LinkedHashSet<Integer> set = new LinkedHashSet<>();
	        for (int num : array) {
	            set.add(num);
	        }

	        int[] result = new int[set.size()];
	        int i = 0;
	        for (int num : set) {
	            result[i++] = num;
	        }

	        return result;
	    }
	}


