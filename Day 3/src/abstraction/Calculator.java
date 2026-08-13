package abstraction;

class Calculator extends Arithmetic{
	//super.display();
	@Override
	int add(int a, int b) {
		return a+b;
	}

	@Override
	int sub(int a, int b) {
		return a-b;
	}
}
