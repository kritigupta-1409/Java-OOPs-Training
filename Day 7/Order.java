package queue;

public class Order {
	int orderId;
	long mobileNumber;
	String orders;
	
	public Order(int orderId, long mobileNumber, String orders) {
		super();
		this.orderId = orderId;
		this.mobileNumber = mobileNumber;
		this.orders = orders;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getOrders() {
		return orders;
	}
	public void setOrders(String orders) {
		this.orders = orders;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", mobileNumber=" + mobileNumber + ", orders=" + orders + "]";
	}
	
	
}
