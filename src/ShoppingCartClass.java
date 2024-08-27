
public class ShoppingCartClass {
	private Item[] balls;
	private int totalItems;
	
	public ShoppingCartClass() {
		balls = new Item[10];
		totalItems++;
		totalItems = 0;	
	}
	
	public void addItem(Item item) {
		balls[totalItems++] = item;
	}
	
	public int getTotalItems() {
		return totalItems;
	}
	
	public Item[] unloadAllItems() {
		Item[] itemsInCart = new Item[totalItems];
		for(int i=0; i<totalItems; i++);
			itemsInCart[i] = balls[i];
		totalItems = 0;
		return itemsInCart;
	}
	
	
		
}
