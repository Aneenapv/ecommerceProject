package ecommerceProject;

import java.util.ArrayList;
import java.util.HashMap;

public class Customer extends User implements Payment, Rewardable, DirectDeposit, Investment {

	private double balance;

	private int rewardPoints;

	// double deduct;

	int points;

	double salary;
	
	double investment;
	
	double fhsa;
	
	double rrsp;
	
	double balanceAfterInvestment;
	
	ArrayList<Double> aList = new ArrayList<>();
	
	HashMap<String,Double> hmap = new HashMap<String,Double>();

	public Customer(String name, String companyName) {
		super(name,companyName);
		

	}

	public Customer(String name, double balance, String companyName) {
		super(name,companyName);
		this.balance = balance;
	}

	public void displayUserDetails() {
		System.out.println("user name : " + getName());
		System.out.println("balance   : " + balance);
		System.out.println("reward points : " + rewardPoints);
		System.out.println("Company name: " +getCompanyName());
		System.out.println("salary credited :" + salary);
		System.out.println("Amount deposited in fhsa: "+fhsa);
		System.out.println("Amount deposited in rrsp: "+rrsp);
		System.out.println("Total Investment: "+investment);
		System.out.println("Final Balance after investments: "+ balanceAfterInvestment);
		System.out.println("List of investments: "+aList);   //using arraylist 
		System.out.println("List of investments and thier type: "+hmap);         // using hashmap
		System.out.println("__________________");
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

	@Override
	public void salary(double sal) {
        this.salary = sal;
		balance = sal + balance;

	}

	@Override
	public void fhsa(double fhsaDeposit) {
		if(salary>fhsaDeposit)
		{
		this.fhsa=fhsaDeposit;
		investment = investment + fhsaDeposit;
		balanceAfterInvestment = balance - investment;
		aList.add(fhsa);
		hmap.put("FHSA",fhsa);
		}
		else
		{
			System.out.println("Not sufficient fund to invest");
		}
	}

	@Override
	public void tfsa(double tfsaDeposit) {
	
		
	}

	@Override
	public void rrsp(double rrspDeposit) {
		this.rrsp = rrspDeposit;
		investment = investment + rrspDeposit;
		balanceAfterInvestment = balance - investment;
		aList.add(rrsp);
		hmap.put("RRSP",rrsp);
		
	}

	@Override
	public void resp(double respDeposit) {
	
		
	}

}
