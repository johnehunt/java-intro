
public class ShoppingBasketApp {

	public static void main(String[] args) {
		// Can call method on interface
		Printer.printMe();
		// Compile error
		// ShoppingBasket.printMe();
		// Compile error
		ShoppingBasket basket = new ShoppingBasket();
		// basket.printMe();
	}

}
