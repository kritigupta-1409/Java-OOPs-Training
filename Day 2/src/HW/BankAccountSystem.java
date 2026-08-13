package encapsulation;

public class BankAccountSystem {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(1001, "Kriti", 20000, "Savings");

        // Using setters
        // b1.setAccountNum(1001);
        // b1.setName("Kriti");
        // b1.setBalance(20000);
        // b1.setAccountType("Savings");

        b1.deposit(10000);

        b1.withdraw(5000);

        b1.getBankDetails();
	}

}
