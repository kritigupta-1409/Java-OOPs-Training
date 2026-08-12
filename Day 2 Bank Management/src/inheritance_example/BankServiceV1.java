package inheritance_example;

public class BankServiceV1 {
	void deposit(long accNo,float amt) {
		System.out.println("Amount "+amt+"deposited to "+accNo);
	}
	void withdraw(long accNo,float amt) {
		System.out.println("Amount "+amt+"withdrawn from "+accNo);
	}
	void printReciept() {
		System.out.println("Account no: ");
		System.out.println("Account holder name");
		System.out.println("Balance");
	}
}
