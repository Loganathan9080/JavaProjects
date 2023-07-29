package OnlineShoppingCart;

import java.util.Scanner;

public class OnlineCartApp {

	public static void main(String[] args) {
		Items item = new Items("Vivo", 9999.0);
		Items item1 = new Items("IPhone", 98999.0);
		Items item2 = new Items("Oppo", 9899.0);
		OnlineShoppingCart cart = new OnlineShoppingCart();
		cart.addItem(item);
		cart.addItem(item1);
		cart.addItem(item2);

		Scanner scanner = new Scanner(System.in);

		String userInput;
		do {
			System.out.println("Your Shopping cart contains: ");
			for (Items items : cart.getItem()) {
				System.out.println(items.getName() + " - $" + items.getPrice());
			}
			System.out.println();
			System.out.println("Total: $" + cart.getTotal());
			System.out.println();
			System.out.println(
					"Enter 'checkout' to complete the purchase or the product name to remove it from the cart: ");
			userInput = scanner.nextLine();
			if (!userInput.equalsIgnoreCase("checkout")) {
				Items Remove = null;
				for (Items items : cart.getItem()) {
					if (items.getName().equalsIgnoreCase(userInput)) {
						Remove = items;
						break;
					}
				}
				if (Remove != null) {
					cart.removeItem(Remove);
					System.out.println(userInput + " has been removed from the cart.");
				} else {
					System.out.println("product not found!.");
				}
			}

		} while (!userInput.equalsIgnoreCase("checkout"));
		System.out.println("Thank you for your purchase.");
	}

}
