package encapsulation;
public class ReportCardSystem {
	public static void main(String[] args) {
	ReportCard s1=new ReportCard(1111,"kriti",87,96,98);
//		s1.setRollNo(1111);
//		s1.setName("kriti");
//		s1.setM1(95);
//		s1.setM2(87);
//		s1.setM3(97);
	s1.calcResult();
	s1.getStudentDetails();
	}
}
