package problem4;

public class ItemDemo {
	public static void main(String[] args) {
		
		Item[] items = new Item[5];
		
		items[0] = new Item(1, "cup", "Store 1", 5);
		items[1] = new Item(2, "cup", "Store 2", 8);
		items[2] = new Item(3, "cup", "Store 3", 2);
		items[3] = new Item(4, "vase", "Store 1", 20);
		items[4] = new Item(5, "straw", "Store 3", 1);
		
		System.out.println("Best Price: " + getBestPrice(items, "cup"));
		
		Item[] temp = getAllMatchingItems(items, "cup");
		
		System.out.println("Here are all cup items: ");
		
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i].toString());
		}
		
		reducePrice(items[1], 50);
		
		System.out.println("\n");
		
		for (int i = 0; i < items.length; i++) {
			System.out.println(items[i].toString());
		}
		
	}
	
	public static double reducePrice(Item item, double percent) {
		
		double newValue = item.getPrice() - item.getPrice() * (percent/100);
		item.setPrice(newValue);
		return newValue;
		
	}
	
	public static Item[] getAllMatchingItems(Item[] items, String name) {
		int count = 0;
		
		for(int i = 0; i < items.length; i++) {
			if(items[i].getItemName().equalsIgnoreCase(name)) {
				count++;
			}
		}
		
		Item[] temp = new Item[count];
		
		int pos = 0;
		for(int i = 0; i < items.length; i++) {
			if(items[i].getItemName().equalsIgnoreCase(name)) {
				temp[pos] = items[i];
				pos++;
			}
		}
		
		return temp;
		
	}
	
	public static double getBestPrice(Item[] items, String name) {
		
		double min = -1; // -1 demarks null in this case
		for(int i = 0; i < items.length; i++) {
			if(items[i].getItemName().equalsIgnoreCase(name) && (min == -1 || items[i].getPrice() < min)) {
				min = items[i].getPrice();
			}
			
		}
		return min;
		
	}

}
