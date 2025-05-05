package day4;

public class Employee {

	
	int empnum;
	double sal;
	String empname;
	String deptname = "QA Analyst";
	
	public void printDetails()
	{
		System.out.println("Employee number = "+empnum);
		System.out.println("Employee salary = "+sal);
		System.out.println("Employee name = "+empname);
		System.out.println("department name = "+deptname);
	}
	
	public void setDetails(int num, double salary, String name, String dept)
	{
		empnum = num;
		sal = salary;
		empname =name;
		deptname = dept;
	}
}
