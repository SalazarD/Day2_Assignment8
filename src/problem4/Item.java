package problem4;

public class Item {
	
	private int itemId;
	private String itemName;
	private String itemSeller;
	private double price;
	
	public Item(int itemId, String itemName, String itemSeller, double price) {
		
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemSeller = itemSeller;
		this.price = price;
		
	}

	public int getItemId() {
		return itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public String getItemSeller() {
		return itemSeller;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemSeller=" + itemSeller + ", price=" + price
				+ "]";
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
