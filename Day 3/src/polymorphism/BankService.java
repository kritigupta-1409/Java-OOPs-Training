package polymorphism;

public class BankService {
	double currentBalance=2000.00;
	void deposit(String empId,long chelonNo,float amount) {
		currentBalance+=amount;
		System.out.println("Amount: "+amount);
		System.out.println("EmpId: "+empId);
		System.out.println("Amount deposited successfully");
		System.out.println("Updated current balance "+currentBalance);
	}
	void deposit(String upiId,int upiPin,float amount) {
		currentBalance+=amount;
		System.out.println("Amount: "+amount);
		System.out.println("UpiId: "+upiId);
		System.out.println("Amount transferred successfully");
		System.out.println("Updated current balance "+currentBalance);
	}
	void deposit(long custId,String password,float amount) {
		currentBalance+=amount;
		System.out.println("Amount: "+amount);
		System.out.println("NetBanking Id: "+custId);
		System.out.println("Amount transferred successfully");
		System.out.println("Updated current balance "+currentBalance);
	}
}
