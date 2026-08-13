package encapsulation;

public class BankAccount {
	 private int accountNum;
	    private String name;
	    private double balance;
	    private String accountType;

	    static String bankName = "State Bank of India";

	    public BankAccount(int accountNum, String name, double balance, String accountType) {
	        this.accountNum = accountNum;
	        this.name = name;
	        this.balance = balance;
	        this.accountType = accountType;
	    }

	    public int getAccountNum() {
	        return accountNum;
	    }

	    public void setAccountNum(int accountNum) {
	        this.accountNum = accountNum;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void setBalance(double balance) {
	        this.balance = balance;
	    }

	    public String getAccountType() {
	        return accountType;
	    }

	    public void setAccountType(String accountType) {
	        this.accountType = accountType;
	    }

	    void deposit(double amount) {
	        balance = balance + amount;
	    }

	    void withdraw(double amount) {
	        if (amount <= balance) {
	            balance = balance - amount;
	        } else {
	            System.out.println("Insufficient balance");
	        }
	    }

	    void getBankDetails() {
	        System.out.println(this.accountNum + " " + this.name + " "
	                + this.balance + " " + this.accountType);
	        System.out.println(this.bankName);
	    }
}
