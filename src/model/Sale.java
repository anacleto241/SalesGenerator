package model;

import java.util.ArrayList;
import java.util.List;

public class Sale {
	private List<Item> items;

    public Sale() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getSubtotal();
        }
        return total;
    }

	public List<Item> getItems() {
		return items;
	}
    
}
