package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	
	public static void main(String[] args)
	{
		
		// heterogenios data allowed, insertion order not preserved, duplicates not allowed, 
		//multiple nulls not allowed/ only single null is allowed
		
		HashSet myset = new HashSet();
		
		//Set myset = new HashSet();  // parent child class reference
		
		// if we want to save homogenious data
		//HashSet <String> myset = new HashSet<String>();
		
		myset.add(100);
		myset.add(100.1);
		myset.add("java hash set");
		myset.add(100);
		myset.add('K');
		myset.add(null);
		myset.add(100.1);
		myset.add(null);
		
		System.out.println(myset);
		
		System.out.println(myset.size());
		
		//myset.remove(100.1);  // to remove value we have to pass the value directly
		System.out.println(myset);
		
		// insertion of element is not possible
		
		//only add the elements
		
		myset.add("python");
		System.out.println(myset);
		
		System.out.println(myset.size());
		
		// convert hash set to arraylist
		
		ArrayList list = new ArrayList(myset);
		
		System.out.println(list);
		
		list.add(2,"AI ML");
		System.out.println(list);
		
		list.remove(5);
		System.out.println(list);
		
		System.out.println(list.get(4));
		
		System.out.println(myset.size());
		
		System.out.println("output from for each loop");
		for(Object x:myset)
		{
			System.out.println(x);
		}
		
		System.out.println("output from for each loop with arraylist");
		for(Object x:list)
		{
			System.out.println(x);
		}
		
		System.out.println("output from for loop using arraylist");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println("iterator output");
		
		Iterator it = myset.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		myset.clear();
		System.out.println(myset);
		
		System.out.println("is the myset empty:" +myset.isEmpty());
		
	
		
		
		
	}

}
