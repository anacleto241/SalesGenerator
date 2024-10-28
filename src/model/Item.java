package model;

import java.util.List;

public class Item {
	private Product product;
	private int amount;
	private double subtotal; 
	
	public Item(Product product, int amount) {
		this.product = product;
		this.amount = amount;
		this.subtotal = amount * product.getValue();
	}
	
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
