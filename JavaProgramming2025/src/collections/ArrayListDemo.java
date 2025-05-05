package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args)
	{
		// collection(interface) > list (interface) > arraylist(class)
		// declaration
		//ArrayList myList = new ArrayList();  
		// arraylist will allow to declare heterogeneous type data, allow duplicates, allow null values, insertion order preserved.
		
		//List myList = new ArrayList();  // child class object can store in parent class variable.
		
		
		//if we want to store homogeneous type data --use wrapper class
		
		//ArrayList <Integer> myList = new ArrayList<Integer>();
		//ArrayList <String> myList = new ArrayList<String>();
		
		ArrayList myList = new ArrayList();
		myList.add(100);
		myList.add(10.3);
		myList.add(10);
		myList.add("arraylist");
		myList.add(null);
		myList.add(10.1);
		myList.add(null);
		
		System.out.println("size of an array list: "+myList.size());
		
		System.out.println("data from array list: "+myList);
		
		myList.remove(4);  //null removed
		
	   System.out.println("new list: "+myList);
	   
	   myList.add(0,"Core Java");
	   System.out.println(myList);
	   
	   
	   myList.set(0,"python-selenium");
		System.out.println(myList);
		
		System.out.println(myList.get(4));
		
		
		//read the elements from array list
		
		for(int i=0; i<=myList.size()-1;i++)
		{
			System.out.println(myList.get(i));
		}
		
		for(Object x:myList)
		{
			System.out.println(x);
		}
		
		Iterator it = myList.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("Is array list empty or not: "+myList.isEmpty());
		
		
		//remove random multiple elements
		ArrayList myList2 = new ArrayList();
		
		myList2.add(10.1);
		myList2.add(10.3);
		myList2.add(10);
		
		myList.removeAll(myList2);
		
		System.out.println(myList);
		
		// remove all elements
		//myList.clear();
		//System.out.println("is array list empty: "+myList.isEmpty());
		
		
		
	}
}
