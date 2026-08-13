package exception_handling;

import java.util.Scanner;

class 	Instagram{
	void createAccount() throws InvalidAgeException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Type your age");
		int age=sc.nextInt();
		
		if(age<18)
			throw new InvalidAgeException("Invalid Age..Age mus be >18");
		System.out.println("Account created Successfully..");
	}
}
public class CustomExceptionExample {

	public static void main(String[] args) {
		Instagram obj1=new Instagram();
		try {
		obj1.createAccount();
		}
		catch(InvalidAgeException e) {
			System.out.println(e);
		}
		System.out.println("Rest of the code..");
	}
}

