package model;

import java.util.ArrayList;
import java.util.List;

public class ProductController {
	private List<Product> products;

	public ProductController() {
		products = new ArrayList<>();
	}
	
	public void addProduct(Product product){
		products.add(product);
	}
	
	public Product searchProduct(String name) {
		for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
         }
		return null;
	}
		
}
