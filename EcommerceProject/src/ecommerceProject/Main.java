package ecommerceProject;

public class Main {

	public static void main(String[] args) {

		User.showPlatformName();

		Customer c1 = new Customer("Alice");

		Customer c2 = new Customer("Bob", 150.0);

		c1.greet();
		c2.greet();
		

		c1.displayUserDetails();
		c2.displayUserDetails();
		

		c1.recharge(100).processPayment(45); // in method chaining return type should be objects

		c2.processPayment(200);

		System.out.println("===================");

		c1.displayUserDetails();
		c2.displayUserDetails();
	}

}
