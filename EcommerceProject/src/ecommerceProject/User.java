package ecommerceProject;

public abstract class User {

	private String name;

	static String platformName = "ShopEZ";

	User(String name) {
		this.setName(name);
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
}
