package service;

import java.util.ArrayList;
import java.util.List;

import entity.Product;
import exception.ProductNotFoundException;

public class ProductServiceImpl implements ProductService {
	List<Product> allProducts=new ArrayList<>(
			List.of(new Product(1111,"shirt","cloth",56.00f,40))
			);
	@Override
	public List<Product> getAllProduct() {
		return allProducts;
	}

	@Override
	public void searchProduct(int proId) throws ProductNotFoundException {
		for(Product pro:allProducts) {
			if(pro.getProdId()==proId) {
				System.out.println(pro);
				return;
			}
		}
		throw new ProductNotFoundException("Product Not Found");
	}

	@Override
	public void addNewProduct(Product newPro) {
		allProducts.add(newPro);
	}

	@Override
	public void updateStock(int proId, int stockCount) throws ProductNotFoundException {
	    for (Product pro : allProducts) {
	        if (pro.getProdId() == proId) {
	            pro.setStockCount(stockCount);
	            System.out.println("Stock updated successfully.");
	            return;
	        }
	    }

	    throw new ProductNotFoundException("Product with ID " + proId + " not found");
	}

	@Override
	public void deleteProduct(int proId) throws ProductNotFoundException {
	    boolean removed = allProducts.removeIf(pro -> pro.getProdId() == proId);

	    if (removed) {
	        System.out.println("Product deleted successfully.");
	    } else {
	        throw new ProductNotFoundException(
	            "Product with ID " + proId + " not found"
	        );
	    }
	}
	
}
