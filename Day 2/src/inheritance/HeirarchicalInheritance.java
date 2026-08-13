package inheritance;
class Head{
	String headOffice="ABC str,Srec,Delhi";
	void display() {
		System.out.println("hello");
	}
}
class ChennaiOfc extends Head{
	void chennaiOfcReport() {
		System.out.println("Head Office Location:"+super.headOffice);
		System.out.println("Today Chennai Report");
	}
}
class CoimbatoreOfc extends Head{
	void cbeOfcReport() {
		System.out.println("Head office Location:"+super.headOffice);
		System.out.println("Today Chennai Report");
	}
}

public class HeirarchicalInheritance {

	public static void main(String[] args) {
		ChennaiOfc b1=new ChennaiOfc();
		b1.chennaiOfcReport();
		CoimbatoreOfc b2=new CoimbatoreOfc();
		b2.cbeOfcReport();
	}

}
