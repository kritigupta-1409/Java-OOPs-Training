package entity;

public class Product {
	private int prodId;
	private String prodName;
	private String category;
	private float price;
	private int stockCount;
	public Product(int prodId, String prodName, String category, float price, int stockCount) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.category = category;
		this.price = price;
		this.stockCount = stockCount;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getStockCount() {
		return stockCount;
	}
	public void setStockCount(int stockCount) {
		this.stockCount = stockCount;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", category=" + category + ", price=" + price
				+ ", stockCount=" + stockCount + "]";
	}
	
}
