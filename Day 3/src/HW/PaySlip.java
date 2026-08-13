package encapsulation;

public class PaySlip {
	private int empId;
    private String empName;
    private double basicSalary;
    private double hrPayment;
    private double daPayment;
    private double totalPayment;

    static String companyName = "ABC Company";

    public PaySlip(int empId, String empName, double basicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getHrPayment() {
        return hrPayment;
    }

    public double getDaPayment() {
        return daPayment;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    void calculateHRPayment() {
        hrPayment = basicSalary * 10 / 100;
    }

    void calculateDAPayment() {
        daPayment = basicSalary * 5 / 100;
    }

    void calculateTotalPayment() {
        totalPayment = basicSalary + hrPayment + daPayment;
    }

    void getPaySlip() {
        System.out.println(this.empId + " " + this.empName + " "
                + this.basicSalary + " " + this.hrPayment + " "
                + this.daPayment + " " + this.totalPayment);

        System.out.println(this.companyName);
    }
}
