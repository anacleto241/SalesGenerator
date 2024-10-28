package view;
import model.*;

public class PrintSale {
	public void displaySale(Sale sale) {
		System.out.println("Nota de Venda:");
        for (Item item : sale.getItems()) {
            System.out.printf("%s - Qtd: %d - Preço: %.2f - Subtotal: %.2f\n",
                    item.getProduct().getName(), item.getAmount(),
                    item.getProduct().getValue(), item.getSubtotal());
        }
        System.out.printf("Total da Venda: %.2f\n", sale.calculateTotal());
    }
	}
