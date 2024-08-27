
public class Item {

	public String name;
	public double price;
	private int itemID;
	private static int total;
	
	Item(String itemName, double itemPrice) {
		name = itemName;
		price = itemPrice;
		total++;
		itemID = total;
	}
	
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void changePrice(double newPrice) {
		price = newPrice;
	}
	
	public int getItemID() {
		return itemID;
	}
	
	public static int getTotal() {
		return total;
	}
	
}
