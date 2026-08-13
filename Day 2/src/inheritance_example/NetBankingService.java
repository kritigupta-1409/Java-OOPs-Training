package inheritance_example;

public class NetBankingService extends PaymentService {
	void payWithNetBanking(long mobile,long custId) {
		super.sendOTP(mobile);
		System.out.println("Purchased with Net Banking"+custId);
	}
}
