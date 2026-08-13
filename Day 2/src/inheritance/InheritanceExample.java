package inheritance;
class Parent{
	int a,b;
	void display() {
		System.out.println("this is parent class");
	}
}
class Child extends Parent{
	void calc() {
		super.a=10;
		super.b=20;
		int c=super.a+super.b;
		System.out.println("Addition "+ c);
		super.display();
	}
}
class GrandChild extends Child{
	
}

public class InheritanceExample {

	public static void main(String[] args) {
		GrandChild c1=new GrandChild();
		c1.display();
		c1.calc();
	}

}
