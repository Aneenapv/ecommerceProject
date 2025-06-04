package ecommerceProject;

public class Customer extends User implements Payment, Rewardable {

	private double balance;

	private int rewardPoints;

	// double deduct;

	int points;

	public Customer(String name) {
		super(name);

	}

	public Customer(String name, double balance) {
		super(name);
		this.balance = balance;
	}

	public void displayUserDetails() {
		System.out.println("user name : " + getName());
		System.out.println("balance   : " + balance);
		System.out.println("reward points : " + rewardPoints);
	}

	@Override
	public void processPayment(double amount) {
		if (balance > amount) {
			balance = balance - amount;

			points = (int) (amount / 10);

			rewardPoints = points;
		} else {
			System.out.println("Insufficient amount. Please keep your account in good status");
		}

	}

	@Override
	public void addRewardPoints(int points) {

		System.out.println("points added: " + points);

	}

	@Override
	void greet() {

		System.out.println("Good morning / Good evening : " + getName());

	}

	public Customer recharge(double amount) {
		balance = balance + amount;
		return this;
	}

}
