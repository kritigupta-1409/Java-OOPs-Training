package polymorphism;
class SwiggyV1{
	
	void sendOTP() {
		System.out.println("Type your email");
		System.out.println("OTP sent to mail..pls enter");
	}
}
class SwiggyV2 extends SwiggyV1{
	
	@Override
	void sendOTP() {
		super.sendOTP();//use if else
		System.out.println("Type your mobile");
		System.out.println("OTP sent to mobile..pls enter");
	}
	void placeOrder() {
		System.out.println("your order placed");
	}
}
//if we create v3 and add super v2's sendotp will be called

public class MethodOverridingExample {

	public static void main(String[] args) {
		SwiggyV2 obj1=new SwiggyV2();
		obj1.sendOTP();
		obj1.placeOrder();
	}
}
