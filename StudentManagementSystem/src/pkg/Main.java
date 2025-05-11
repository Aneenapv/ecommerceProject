package pkg;

public class Main {
	
public static void main (String[] args)
{
	Student s = new Student("Aneena",32,"1234");
	
	s.display();
	
	Student.static_Show();
	
	System.out.println("value of a: "+ Student.a);
	
	System.out.println("student detail: "+s.name +" "+s.age+ " "+s.studentId);
	
}

}
