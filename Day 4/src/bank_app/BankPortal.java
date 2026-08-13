package bank_app;

import java.util.Scanner;

public class BankPortal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankService service=new BankService();
		System.out.println("-----Bank Portal-----");
		System.out.println("1.Search Account \n2.Cash Withdrawal\n3.Login");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Type acc No");
			int accNo=sc.nextInt();
			try {
				service.searchAccount(accNo);
			} catch (AccountNotFoundException e) {
				System.out.println(e);
			}
			break;
		case 2:
			System.out.println("Type your amount");
			float amount=sc.nextFloat();
			try {
				service.withdrawl(amount);
			} catch (InsufficientBalanceException e) {
				System.out.println(e);
			} catch (InvalidAmountException e) {
				System.out.println(e);
			}
			break;
		case 3:
			System.out.println("Enter pin");
			int pin=sc.nextInt();
			System.out.println("Enter card no:");
			int cardNo=sc.nextInt();
			try {
				service.login(cardNo,pin);
			} catch (InvalidPinException e) {
				System.out.println(e);
			}
			break;
		default:
			System.out.println("invalid choice");
		}
			
	}

}
