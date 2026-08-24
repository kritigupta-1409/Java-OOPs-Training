package service;

import java.util.List;

import entity.Product;
import exception.ProductNotFoundException;

public interface ProductService {
	List<Product> getAllProduct();
	
	void searchProduct(int proId) throws ProductNotFoundException;
	
	void addNewProduct(Product newPro);
	
	void updateStock(int proId, int stockCount) throws ProductNotFoundException;
	
	void deleteProduct(int proId) throws ProductNotFoundException;
}
