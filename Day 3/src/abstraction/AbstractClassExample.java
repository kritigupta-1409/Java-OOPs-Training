package abstraction;


public class AbstractClassExample {

	public static void main(String[] args) {
		Calculator obj=new Calculator();
		System.out.println(obj.add(10, 20));
		//Arithmetic obj2=new Arithmetic();we cant create object for abstract class
	}
}
