package inheritance_example;

public class CreditCardService extends PaymentService{
	void payWithCreditCard(long mobile,long cardNo) {
		super.sendOTP(mobile);
		System.out.println("Purchased with Credit Card"+cardNo);
	}
}
