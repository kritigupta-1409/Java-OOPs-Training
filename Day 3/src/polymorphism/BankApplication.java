package polymorphism;
import java.util.*;

public class BankApplication {

	public static void main(String[] args) {
		BankService obj=new BankService();
		Scanner sc=new Scanner(System.in);
		System.out.println("Amount deposit gateway");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			obj.deposit("kriti123",9897655,2000);
			break;
		case 2:
			obj.deposit("kriti111", 1234, 2000);
			break;
		case 3:
			obj.deposit(9878668, "kriti", 2000);
			break;
		default:
			System.out.println("invalid choice");
		}
		
	}

}
