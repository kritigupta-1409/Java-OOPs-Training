import java.util.Scanner;

import entity.Product;
import exception.ProductNotFoundException;
import service.ProductServiceImpl;

public class ProductInventorySystem {

	public static void main(String[] args) throws ProductNotFoundException {
		Scanner sc=new Scanner(System.in);
		
		ProductServiceImpl service=new ProductServiceImpl();
		int choice=0;
		do {
			System.out.println("===================");
			System.out.println("1. Show All products \n2.Search Product \n3.Add product \n4.update stock Quantity \n5.Delete \n6.Exit");
			System.out.println("===================");
			choice=sc.nextInt();
			switch(choice) {
			
			case 1:
				for(Product pro: service.getAllProduct()) {
					System.out.println(pro);
				}
				break;
			case 2:
				System.out.println("Type product id");
				int proId=sc.nextInt();
				try {
					service.searchProduct(proId);
				} catch (ProductNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				System.out.println("enter new productid");
				int id=sc.nextInt();
				
				System.out.println("enter new product Name");
				String name=sc.next();
				
				System.out.println("enter new product category");
				String category=sc.next();
				
				System.out.println("enter new product price");
				float price=sc.nextFloat();
				
				System.out.println("enter new product Quantity");
				int stock=sc.nextInt();
				
				service.addNewProduct(new Product(id, name, category, price, stock));
				break;
			
			case 4:
			    System.out.print("Enter product ID: ");
			    int proid = sc.nextInt();

			    System.out.print("Enter new stock count: ");
			    int stockQuantity = sc.nextInt();

			    try {
			        service.updateStock(proid, stockQuantity);
			    } catch (ProductNotFoundException e) {
			        System.out.println(e.getMessage());
			    }
			    break;
				
			case 5:
			    System.out.println("Enter product id to delete:");
			    int prodId = sc.nextInt();

			    try {
			        service.deleteProduct(prodId);
			    } catch (ProductNotFoundException e) {
			        System.out.println(e.getMessage());
			    }
			    break;
			case 6:
				System.out.println("Thank you:)");
				break;
			}
		}
		while(choice!=6);
	}

}
