package ecommerceProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Customer extends User implements Payment, Rewardable, DirectDeposit, InvestmentDeposit{

	private double balance;

	int pointsAdded;
	int totalPoints = 0;

	double salary;

	double investment;

	double balanceAfterInvestment;

	//ArrayList arrayListOfAccountType = new ArrayList();
	
	HashMap<AccountType,Double> mapAccountType = new HashMap<AccountType,Double>();
	

	public Customer(String name, String companyName) {
		super(name, companyName);

	}

	public Customer(String name, double balance, String companyName) {
		super(name, companyName);
		this.balance = balance;
	}

	public void displayUserDetails() {
		System.out.println("user name : " + getName());
		System.out.println("balance   : " + balance);
		System.out.println("Total reward points : " + totalPoints);
		System.out.println("Company name: " + getCompanyName());
		System.out.println("salary credited :" + salary);
		
		//System.out.println("from arrayList of account type: "+arrayListOfAccountType);
		
		System.out.println("Amount deposited in investment accounts:"+mapAccountType);
		//System.out.println("Amount deposited in fhsa: " + fhsa);
		System.out.println("Total Investment: " + investment);
		System.out.println("Final Balance after investments: " + balanceAfterInvestment);
	
		System.out.println("__________________");
	}

	@Override
	public Customer processPayment(double amount) {
		if (balance > amount) {
			balance = balance - amount;

			pointsAdded = (int) (amount / 10);

		} else {
			System.out.println("Insufficient amount. Please keep your account in good status");

		}
		return this;

	}

	@Override
	public Customer addRewardPoints() {

		totalPoints = totalPoints + pointsAdded;
		return this;

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

		if ((salary > fhsaDeposit) && (fhsaDeposit > 0)) {
			//this.fhsa = fhsaDeposit;
			//arrayListOfAccountType.add(fhsa);
			mapAccountType.put(AccountType.FHSA,fhsaDeposit);
			investment = investment + fhsaDeposit;
			balanceAfterInvestment = balance - investment;
			
		} else {
			System.out.println("Not sufficient fund to invest in fhsa");
		}

	}

	@Override
	public void tfsa(double tfsaDeposit) {
		
		if ((salary > tfsaDeposit) && (tfsaDeposit > 0)) {
			//arrayListOfAccountType.add(tfsa);
			mapAccountType.put(AccountType.TFSA,tfsaDeposit);
			investment = investment + tfsaDeposit;
			balanceAfterInvestment = balance - investment;
			
		} else {
			System.out.println("Not sufficient fund to invest in tfsa");
		}
		
	}

	@Override
	public void rrsp(double rrspDeposit) {
		if ((salary > rrspDeposit) && (rrspDeposit > 0)) {
			//arrayListOfAccountType.add(rrsp);
			mapAccountType.put(AccountType.RRSP,rrspDeposit);
			investment = investment + rrspDeposit;
			balanceAfterInvestment = balance - investment;
			
		} else {
			System.out.println("Not sufficient fund to invest in rrsp");
		}
		
	}

	@Override
	public void resp(double respDeposit) {
		if ((salary > respDeposit) && (respDeposit > 0)) {
			//arrayListOfAccountType.add(resp);
			mapAccountType.put(AccountType.RESP,respDeposit);
			investment = investment + respDeposit;
			balanceAfterInvestment = balance - investment;
			
		} else {
			System.out.println("Not sufficient fund to invest in resp");
		}
		
	}
	
	
	
	

   
}

	

	
	
