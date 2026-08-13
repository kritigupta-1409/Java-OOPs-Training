package encapsulation;

public class PaySlipSystem {

	public static void main(String[] args) {

        PaySlip p1 = new PaySlip(111, "Kriti", 25000);

        p1.calculateHRPayment();

        p1.calculateDAPayment();
        p1.calculateTotalPayment();
        p1.getPaySlip();

	}

}
