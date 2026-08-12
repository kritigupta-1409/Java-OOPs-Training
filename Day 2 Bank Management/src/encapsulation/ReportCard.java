package encapsulation;

public class ReportCard {
	private int rollNo;
	private String name;
	private int m1;
	private int m2;
	private int m3;
	private int total;
	private float avg;
	private String grade;
	static String college="srec";
	public ReportCard(int rollNo, String name, int m1, int m2, int m3) {
		this.rollNo = rollNo;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	void calcResult() {
		total=m1+m2+m3;
		avg=total/3;
		if(avg>90) {
			grade="o";
		}else if(avg>75) {
			grade="A+";
		}else if(avg>60) {
			grade="A";
		}else if(avg>50) {
			grade="b+";
		}else if(avg>=40){
			grade="b";
		}else {
			grade="u";
		}
	}
		void getStudentDetails() {
			System.out.println(this.rollNo+" "+this.name+" "+this.m1+" "+this.m2+" "+this.m3+" "+this.total+" "+this.avg+" "+this.grade);
			
		}
}
