package problem2_3;

public class PurchaseTotalDemo {
	
	public static void main(String[] args) {
		PurchaseTotal[] records = new PurchaseTotal[6];
		
		records[0] = new PurchaseTotal(1, "apples", 5, 1, "10/01/2019");
		records[1] = new PurchaseTotal(2, "apples", 5, 2, "10/02/2019");
		records[2] = new PurchaseTotal(3, "apples", 5, 3, "10/03/2019");
		records[3] = new PurchaseTotal(4, "bananas", 3, 6, "10/01/2019");
		records[4] = new PurchaseTotal(5, "cabbage", 7, 1, "10/02/2019");
		records[5] = new PurchaseTotal(6, "bread", 11, 1, "10/03/2019");
		
		System.out.println("Inventory: " + calculateInventory(records, "apples", 10));
		System.out.println("Sales: " + getTotalSales(records, "apples"));
		
		PurchaseTotal[] temp =  getAllPurchaseTotals(records, "apples");
		
		for(int i = 0; i < temp.length; i++) {
			System.out.println(temp[i].toString());
		}
		
		changeItemsSold(records[2], 20);
		
		System.out.println("\n");
		
		for(int i = 0; i < records.length; i++) {
			System.out.println(records[i].toString());
		}
		
		
		
	}
	
	public static void changeItemsSold(PurchaseTotal temp, int amount) {
		temp.setItemsSold(amount);
		
	}
	
	
	public static PurchaseTotal[] getAllPurchaseTotals(PurchaseTotal[] records, String name) {
		
		int count = 0;
		for(int i = 0; i < records.length; i++) {
			if(records[i].getItemName().equalsIgnoreCase(name)) {
				count++;
			}
		}
		PurchaseTotal[] temp = new PurchaseTotal[count];
		int pos = 0;
		for(int i = 0; i < records.length; i++) {
			if(records[i].getItemName().equalsIgnoreCase(name)) {
				temp[pos] = records[i];
				pos++;
			}
		}
		return temp;
		
	}
	
	public static int calculateInventory(PurchaseTotal[] records, String name, int count) {
		
		int sum = 0;
		for(int i = 0; i < records.length; i++) {
			if(records[i].getItemName().equalsIgnoreCase(name)) {
				sum += records[i].getItemsSold();
			}
		}
		return count - sum;
		
	}
	public static double getTotalSales(PurchaseTotal[] records, String name) {
		
		double sum = 0;
		for(int i = 0; i < records.length; i++) {
			if(records[i].getItemName().equalsIgnoreCase(name)) {
				sum += records[i].getItemsSold() * records[i].getPrice();
			}
		}
		
		
		return sum;
	}
}
