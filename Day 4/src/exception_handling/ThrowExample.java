package exception_handling;

class VotingSystem{
	
	static void signup(int age) {
		if(age<18) 
			throw new ArithmeticException("Age is Invalid");
		System.out.println("you can vote");
	}
	static int divide(int a,int b) throws ArithmeticException {
		if(b==0) 
			throw new ArithmeticException("Cant divide by 0");
		return a/b;
	}
}
public class ThrowExample {

	public static void main(String[] args) {
		try {
		VotingSystem.signup(12);
		VotingSystem.divide(10, 0);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("Rest of the code");
	}
}
