package inheritance_example;

public class SingleInheritanceExample {

	public static void main(String[] args) {
		BankServiceV2 b1=new BankServiceV2();
		b1.deposit(1423789,5000);
		b1.withdraw(1234567,10000);
		b1.updateAadharNumber();
	}

}
