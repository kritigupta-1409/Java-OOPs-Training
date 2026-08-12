package inheritance_example;
import java.util.*;

public class HeirarchicalInheritanceExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice==1) {
		CreditCardService s1=new CreditCardService();
		s1.payWithCreditCard(98765432,7836590);
		}
		else if(choice==2) {
		NetBankingService s2=new NetBankingService();
		s2.payWithNetBanking(98765432,7836590);
	}else {
		System.out.println("No service Available");
	}
  }

}
