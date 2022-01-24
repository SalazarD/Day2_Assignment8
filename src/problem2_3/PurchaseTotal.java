package problem2_3;

public class PurchaseTotal {
	
	private int saleId;
	private String itemName;
	private double price;
	private int itemsSold;
	private String date;
	
	public PurchaseTotal(int saleId, String itemName, double price, int itemsSold, String date) {
		
		this.saleId = saleId;
		this.itemName = itemName; 
		this.price = price;
		this.itemsSold = itemsSold;
		this.date = date; 
		
	}

	public int getSaleId() {
		return saleId;
	}

	public String getItemName() {
		return itemName;
	}

	public double getPrice() {
		return price;
	}

	public int getItemsSold() {
		return itemsSold;
	}

	public String getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "PurchaseTotal [saleId=" + saleId + ", itemName=" + itemName + ", price=" + price + ", itemsSold="
				+ itemsSold + ", date=" + date + "]";
	}

	public void setItemsSold(int itemsSold) {
		this.itemsSold = itemsSold;
	}


}
