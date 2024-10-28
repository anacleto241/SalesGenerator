package view;

import model.*;

public class Main {
    public static void main(String[] args) {
        
        ProductController controller = new ProductController();
        controller.addProduct(new Product("Arroz", 20.0));
        controller.addProduct(new Product("Feijão", 15.0));
        
        RegistrationSale registerSale = new RegistrationSale(new Sale(), controller);
        registerSale.StartSale();

        
        registerSale.addProduct("Arroz", 2);
        registerSale.addProduct("Feijão", 3);

        
        Sale nota = registerSale.finishSale();
        PrintSale interfaceVenda = new PrintSale();
        interfaceVenda.displaySale(nota);
    }
}
