package ecommerceProject;


import java.util.HashMap;


public class Main {

	public static void main(String[] args) {
		
		//HashMap<String,Double> mapAccountType = new HashMap<String,Double>();
		

		User.showPlatformName();

		Customer alice = new Customer("Alice","PivotTesting");

		Customer bob = new Customer("Bob", 150.0,"LuminarTechnolab");
		
		

		alice.greet();
		bob.greet();
		System.out.println("=======================");

		alice.displayUserDetails();
		bob.displayUserDetails();
		

		alice.recharge(100).processPayment(45).addRewardPoints(); // in method chaining return type should be objects
		
		bob.recharge(100).processPayment(30).addRewardPoints(); 
		
		alice.salary(500);
		bob.salary(1000);

		bob.processPayment(200);
		
		//alice.fhsa(200);
		
		//AccountType type = AccountType.FHSA;
		//System.out.println(type);
		
		for(AccountType typeOfAccount: AccountType.values())
		{
			if(typeOfAccount==AccountType.FHSA)
			{
			alice.fhsa(200);
			bob.fhsa(100);
			}
			
			if(typeOfAccount==AccountType.TFSA)
			{
			alice.tfsa(100);
			bob.tfsa(100);
			}
			
			if(typeOfAccount==AccountType.RRSP)
			{
			alice.rrsp(50);
			bob.rrsp(50);
			}
			
			if(typeOfAccount==AccountType.RESP)
			{
			alice.resp(20);
			bob.resp(20);
			}
			//System.out.println(typeOfAccount+" : "+typeOfAccount.getDescription());
		}
		
		//alice.processAccount(AccountType.FHSA).fhsa(200);
		
		
		
		System.out.println("===================");

		alice.displayUserDetails();
		bob.displayUserDetails();
		
		
		


		    
		
		
		
	}

}
