package interface_exam;
interface GrandParent{
	void add();
}
interface Parent extends GrandParent{
	void sub();
}
interface Child extends Parent{
	void mul();
}
class Arith implements Child{

	@Override
	public void sub() {
		
	}

	@Override
	public void add() {
		
	}

	@Override
	public void mul() {
		
	}
	
}

public class InterfaceExample2 {

	public static void main(String[] args) {

	}

}
