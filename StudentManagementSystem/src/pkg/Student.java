package pkg;

import java.util.List;

public class Student {
	
	String name;
	int age;
	String studentId;
	
	static int a=3;
	
	//List<String> courses;
	
	Student(String student_name, int student_age, String student_studentId)
	{
		name = student_name;
		age = student_age;
		studentId = student_studentId;
	}
	
	public void display()
	{
		System.out.println(name);
		System.out.println(age);
	}
	
	static void static_Show()
	{
		System.out.println("Static method calling: "+ a);
	}
}
