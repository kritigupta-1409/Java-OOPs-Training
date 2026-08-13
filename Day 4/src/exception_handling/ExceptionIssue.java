package exception_handling;

public class ExceptionIssue {

	public static void main(String[] args) {
		System.out.println("line 1");
		System.out.println("line 2");
		System.out.println("line 3");
		System.out.println("line 4");
		try {
		System.out.println(10/0);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("line 5");
		System.out.println("line 6");
		System.out.println("line 7");
		System.out.println("line 8");
		}
	
}
