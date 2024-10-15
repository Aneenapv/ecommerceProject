package special;
import java.util.Arrays;
public class SecondLowestInArray {

	
	// Program to Find the Second Lowest Element in an Array

	    public static void main(String[] args)
	    {
	        int[] array = {4, 2, 7, 1, 9, 3};
	        int secondLowest = findSecondLowest(array);

	        System.out.println("Second lowest element: " + secondLowest);
	    }

	    public static int findSecondLowest(int[] array) {
	       Arrays.sort(array);
	        return array[1];
	    }
	}

