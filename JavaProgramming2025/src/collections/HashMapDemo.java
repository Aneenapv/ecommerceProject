package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
	
		// hashmap works with key and value
		// key should be unique and for values it allow duplicates
		// insertion order not preserved
		
		//HashMap hmap = new HashMap();
		
		//Map hmap = new HashMap();
		
		// the hashmap key and value is integer and string then we have to declare
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		
		// adding pairs
		
		hmap.put(101,"Aneena");
		hmap.put(102,"sruthy");
		hmap.put(103,"neenu");
		hmap.put(104,"shilpa");
		hmap.put(101,"john");
		hmap.put(105,"sruthy");
		
		System.out.println(hmap);
		
		System.out.println(hmap.size());
		
		hmap.remove(105);
		System.out.println(hmap);
		
		System.out.println(hmap.get(102));
		System.out.println(hmap);
		
		System.out.println(hmap.keySet());
		
		System.out.println(hmap.values());

		System.out.println(hmap.entrySet());
		
		// normal for loop is not possible
		
		// for each loop
		
		for(int n: hmap.keySet())
		{
			System.out.println("key: "+n +" values: "+hmap.get(n));
		}
		
		// using iterator
		
		Iterator it = hmap.entrySet().iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		
		
		
	}

}
