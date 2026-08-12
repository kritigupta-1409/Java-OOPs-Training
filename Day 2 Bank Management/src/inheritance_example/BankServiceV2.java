package inheritance_example;

public class BankServiceV2 extends BankServiceV1 {
	void updateAccountDetails() {
		System.out.println("Account Details updated...");
	}
	void updateAadharNumber() {
		System.out.println("Aadhar No updated...");
	}
	void applyForPersonalLoan(long accNo,float loanAmount,int tenure) {
		System.out.println("Your loan application is processing...");
	}
}
