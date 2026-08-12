package oops;
class Student{
	int rollNo;
	String studentName;
	String gender;
	int age;
	void setValue(int rollNo,String studentName, int age, String gender) {
		this.rollNo=rollNo;
		this.studentName=studentName;
		this.gender=gender;
		this.age=age;
	}
}
public class SchoolSystem {
	public static void main(String[] args) {
		Student s1=new Student();
//		s1.rollNo=1111;
//		s1.studentName="kriti";
//		s1.gender="female";
//		s1.age=20;
		s1.setValue(1001,"kriti",20,"female");
		System.out.println(s1.rollNo +" "+ s1.studentName +" "+ s1.gender+" "+s1.age);
	}

}
