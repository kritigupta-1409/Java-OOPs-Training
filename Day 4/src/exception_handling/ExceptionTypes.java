package exception_handling;

public class ExceptionTypes {

	public static void main(String[] args) {
		int nums[]= {10,20,30,40};
		//System.out.println(nums[8]);//ArrayIndexOutOfBoundsException
		
		String name="java";
		//System.out.println(name.charAt(10));//StringIndexOutOfBoundsException
		
		String str=null;   //null is a sensitive exception in software development. we should handle null pointer exception always
		//System.out.println(str.substring(4));
		
		String value="abc";           //numberformatException
		int rollNo=Integer.parseInt(value);
		System.out.println(rollNo);
		
		//InputMismatchException-recieving different datatype while giving input
		System.out.println("Rest of the code..");  
	}

}
