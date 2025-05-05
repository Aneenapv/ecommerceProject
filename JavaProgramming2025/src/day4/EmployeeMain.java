package day4;

public class EmployeeMain {

	public static void main(String[] args) {
	
		Employee employee1 = new Employee();
		
		employee1.empnum = 1234;
		employee1.sal = 40000;
		employee1.empname="mandakini";
		
		employee1.printDetails();
		
		employee1.setDetails(0001, 45000, "athira", "lingere Business");
		System.out.println();
		employee1.printDetails();

		
Employee employee2 = new Employee();
		
		employee2.empnum = 1235;
		employee2.sal = 50000;
		employee2.empname="mandu";
		
		System.out.println();
		employee2.printDetails();
		
		employee2.setDetails(0002, 55000, "aswathy", "home business");
		System.out.println();
		employee2.printDetails();
		
	}

}
