package polymorphism;
class Arithmetic{
	int add(int a,int b) {
		return a+b;
	}
	int add(int a,int b, int c) {
		return a+b+c;
	}
	void signup(String username,String pass,String name,String user) {
		//account coding
	}
	void signup(String googleToken) {
		//signup with google navigation code here
	}
	
}
public class MethodOverloadingExample {

	public static void main(String[] args) {
		Arithmetic a1=new Arithmetic();
		System.out.println(a1.add(10,20));
		System.out.println(a1.add(10,20,30));
		
		
		String s="Computer Science";
		System.out.println(s.substring(3));
		System.out.println(s.substring(3,7));//java inbuilt method overloading
		
		String str=new String();
		String str2=new String("kriti");//constructor overloading
	}

}
