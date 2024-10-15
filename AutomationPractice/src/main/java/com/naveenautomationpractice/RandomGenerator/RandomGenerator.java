package com.naveenautomationpractice.RandomGenerator;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomGenerator {
	
	//public static void main(String args[])
	//{
		Random random = new Random();
		
	  public static String randomFirstname()
	    {
		// random string of length 8 composed of alphabetic characters 
		String firstname = RandomStringUtils.randomAlphabetic(7);
		return firstname; 
		
		
		//String[] names = {"Aneena","John","Akhil","Jofna","Tenny","saumya","Bajio"};
		//System.out.println("string array length = "+names.length);
		//System.out.println("random values ="+random.nextInt(names.length));
		//System.out.println("randomNames= "+names[random.nextInt(names.length)]);
		
		// random string of length 8 composed of alphabetic characters and numbers
		//String s = RandomStringUtils.randomAlphanumeric(7); 
	
		// random string of length 8 composed only of lettes a, b, and c
		//String alphabet = "abc";
		//String s = RandomStringUtils.random(8, alphabet);
		//System.out.println(s);
	}
	  
	  public static String randomLastname()
	  {
		  String lastname = RandomStringUtils.randomAlphabetic(7);
		return lastname;  
	  }
	  
	 
    

}
