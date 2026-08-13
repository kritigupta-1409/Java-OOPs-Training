package abstraction;
abstract class GrandParent{
	abstract void add();
}
abstract class Parent extends GrandParent{
	abstract void sub();
}
abstract class Child extends Parent{
	abstract void mul();
}
class Arith extends Child{

	@Override
	void mul() {
		
	}

	@Override
	void sub() {
		
	}

	@Override
	void add() {
		
	}
	
}
public class AbstractClassExample2 {

	public static void main(String[] args) {
		

	}

}
