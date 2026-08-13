package polymorphism;

class V1{
	void sendMessage() {
		System.out.println("Message sent to 10 members");
	}
}
class V2 extends V1{
	@Override
	void sendMessage() {
		System.out.println("Message sent to 20 members");
	}
	void display() {       //we cant add another method in child class if were overriding a method
		System.out.println("hello!"); //it wont be called
	}
}

public class MethodDispatchExample {

	public static void main(String[] args) {
		V1 obj=new V2(); //upcasting
		obj.sendMessage();
		//obj.display cant be called directly
		
	}

}
