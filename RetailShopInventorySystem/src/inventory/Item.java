package inventory;

import java.util.HashMap;

public class Item {
	private int price;
	private double quantity;
		public Item(int itemPrice, double itemQuantity) {
		this.price = itemPrice;
		this.quantity = itemQuantity;
	}
	public int getPrice() {
		return this.price;
	}
	public void setQuantity(double quantitySet) {
		this.quantity = quantitySet;
	}
	public double getQuantity() {
		return this.quantity;
	}

//	public static void main(String[] args) {
//		HashMap<String, Item> kayongosRetail = new HashMap<String, Item>();
//		kayongosRetail.put("Blueband", new Item(10000, 150.00));
//		kayongosRetail.put("Eggs", new Item(15000,30.00));
//		kayongosRetail.put("Milk", new Item(50000, 5.00));
//		kayongosRetail.put("Bread", new Item(6000,1.00));
//		kayongosRetail.put("Chicken", new Item(24000, 2.00));
//		System.out.println(kayongosRetail);
//		kayongosRetail.put("Milk", new Item(50000, 10.00));
//		System.out.println(kayongosRetail);
//		for(String item : kayongosRetail.keySet()) {
//			System.out.println("Item : " + item + " " + "Price: "+ " "+ kayongosRetail.get(item).getPrice()+ " Quantity: " + " " + kayongosRetail.get(item).getQuantity());
//			
//		}
		
		
		

	}


