package ecommerceProject;

public class Main {

	public static void main(String[] args) {

		User.showPlatformName();

		Customer c1 = new Customer("Alice","PivotTesting");

		Customer c2 = new Customer("Bob", 150.0,"LuminarTechnolab");
		
		

		c1.greet();
		c2.greet();
		

		c1.displayUserDetails();
		c2.displayUserDetails();
		

		c1.recharge(100).processPayment(45); // in method chaining return type should be objects
		
		c1.salary(500);
		c2.salary(1000);

		c2.processPayment(200);
		
		c1.fhsa(200);
		c1.rrsp(300);

		c2.fhsa(100);
		c2.rrsp(100);
		
		System.out.println("===================");

		c1.displayUserDetails();
		c2.displayUserDetails();
		
		
		
	}

}
