package ecommerceProject;

public enum AccountType {
	FHSA("first home savings account"),
	RRSP("registered retirement savings plan"),
	TFSA("tax free savings account"),
	RESP("registered education savings plan");

	private String description;

	AccountType(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}
