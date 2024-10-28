package model;

public class RegistrationSale {
	private Sale sale;
	private ProductController controller;
	public RegistrationSale(Sale sale, ProductController controller) {
		this.sale = sale;
		this.controller = controller;
	}
	
	public void StartSale() {
		sale = new Sale();
	}
	
	public void addProduct(String nome, int amount) {
		 Product product = controller.searchProduct(nome);
	        if (product != null) {
	            Item item = new Item(product, amount);
	            sale.addItem(item);
	        } else {
	            System.out.println("Produto não encontrado: " + nome);
	        }
	}
	
	public Sale finishSale() {
		return sale;
	}
	
}
