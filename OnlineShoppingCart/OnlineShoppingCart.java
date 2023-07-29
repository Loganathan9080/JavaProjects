package OnlineShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class OnlineShoppingCart {

	private ArrayList<Items> item;

	public OnlineShoppingCart() {
		item = new ArrayList<Items>();
	}

//add item
	public void addItem(Items product) {
		item.add(product);
	}

//remove item
	public void removeItem(Items product) {
		item.remove(product);
	}

//view item
	public List<Items> getItem() {
		return item;

	}

//total calculation
	public double getTotal() {
		double total = 0;
		for (Items items : item) {
			total = total + items.getPrice();
		}
		return total;

	}
}
