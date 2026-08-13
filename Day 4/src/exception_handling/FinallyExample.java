package exception_handling;

import java.util.Scanner;

public class FinallyExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Type your 1st value");
		int a=sc.nextInt();
		
		System.out.println("Type your 2nd value");
		int b=sc.nextInt();
		
		try {
			int result=a/b;
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("---Executed---");
			sc.close();     //closing the db connectivity here
		}
	}

}
