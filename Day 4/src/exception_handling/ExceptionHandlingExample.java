package exception_handling;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		try {
			int nums[]= {10,20,30,40};
			//System.out.println(nums[8]);//ArrayIndexOutOfBoundsException
			
			String name="java";
			//System.out.println(name.charAt(10));//StringIndexOutOfBoundsException
			System.out.println(10/0);
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
	}

}
