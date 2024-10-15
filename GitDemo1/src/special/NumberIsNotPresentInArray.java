package special;
import java.util.HashSet;
public class NumberIsNotPresentInArray {
	
	// Program to Find Which Number is Not Present in the Second Array

	    public static void main(String[] args) 
	    {
	        int[] array1 = {1, 2, 3, 4, 5};
	        int[] array2 = {2, 3, 1, 0, 5};

	        int missingNumber = findMissing(array1, array2);
	        System.out.println("Missing number: " + missingNumber);
	    }

	    public static int findMissing(int[] array1, int[] array2) {
	        HashSet<Integer> set = new HashSet<>();
	        for (int num : array2) {
	            set.add(num);
	        }

	        for (int num : array1) {
	            if (!set.contains(num)) {
	                return num;
	            }
	        }

	        return -1; // or any other appropriate value indicating no missing number
	    }
	}


