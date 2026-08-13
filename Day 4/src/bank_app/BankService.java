package bank_app;

public class BankService {
	double currentBalance=25000;
	long nums[]= {10000,10002,1004,2030};
	void searchAccount(long accNo) throws AccountNotFoundException {
		boolean flag=false;
		for(long num:nums) {
			if(num==accNo) {
				System.out.println("Account found");
				flag=true;
				break;
			}
		}
		if(!flag)
			throw new AccountNotFoundException("Account Not Found");
	}
	void withdrawl(float amount) throws InsufficientBalanceException, InvalidAmountException {
		if(amount<=0)
			throw new InvalidAmountException("Amount should be >100");
		if(amount>currentBalance)
			throw new InsufficientBalanceException("Insufficient Balance");
		currentBalance=currentBalance-amount;
	}
	void login(int cardNo,int pin) throws InvalidPinException {
		if(cardNo==12345678) {
			if(pin==2020) 
				System.out.println("Logged in successfull..");
			else
				throw new InvalidPinException("Incorrect pin Number");
		}else {
			System.out.println("Invalid card");
		}
	}
	public void searchAccountNo(int accNo) {
		// TODO Auto-generated method stub
		
	}
}

