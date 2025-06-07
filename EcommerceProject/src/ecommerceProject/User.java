package ecommerceProject;

public abstract class User {

	private String name;

	static String platformName = "ShopEZ";
	
	private String companyName;

	User(String name, String companyName) {
		this.setName(name);
		this.setCompanyName(companyName);
	}

	static void showPlatformName() {
		System.out.println("platform name: " + platformName);
	}
	


	public void displayUserDetails() {
		System.out.println("users name: " + getName());
	}

	abstract void greet();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}
