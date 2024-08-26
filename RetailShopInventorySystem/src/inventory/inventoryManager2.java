package inventory;

import java.util.HashMap;
import java.util.Scanner;

public class inventoryManager2  {
	HashMap myShop;
	public inventoryManager2() {
		myShop = new HashMap<String, Item>();
	}
	public String addItem(String nameOfTheItem, Item priceQuantity ) {
		myShop.put(nameOfTheItem, priceQuantity);
		return "you have successfully added" +" "+ priceQuantity.getQuantity() + "kg " + " "+ "of " + " " + nameOfTheItem + " @" + priceQuantity.getPrice();
	}
	public HashMap updateQuantity(String itemWhoseQtyUpdated, double updateQuantity) {
		Item item = (Item) myShop.get(itemWhoseQtyUpdated);
		item.setQuantity(updateQuantity);
		myShop.put(itemWhoseQtyUpdated, item);
		return myShop;
		}
		//return "you have successfully update the quantity of the item";
	//}
	public String displayInventory( HashMap<String, Item> shopInventory) {
		String kayongosShop = "";
		for(String inventory : shopInventory.keySet()) {
		  kayongosShop = kayongosShop  + "Inventory: " + inventory + " Price: " + shopInventory.get(inventory).getPrice() + " Quantity: " + shopInventory.get(inventory).getQuantity() + "\n";
		}
		return kayongosShop;
	}
	public HashMap deleteInventory(HashMap<String, Item> shopInventory2 , String removedItem) {
		shopInventory2.remove(removedItem);
		return myShop;
		
	}
	
	public static void main(String[] args) {
		inventoryManager2 shopItem = new inventoryManager2();
		Scanner shop = new Scanner(System.in);
		System.out.println("Enter name of the item : ");
		String shopItemName = shop.nextLine();
		System.out.println("Enter the price of " + shopItemName + " : " );
		int shopItemPrice = shop.nextInt();
		System.out.println("Enter the quantity of " + shopItemName + " : " );
		double quantityOfShopItem = shop.nextDouble();
		System.out.println(shopItem.addItem(shopItemName, new Item(shopItemPrice, quantityOfShopItem)));
//what to work on? find how you can populate myShop hashmap with more items.
//		Scanner addOneMoreItem = new Scanner(System.in);
//		System.out.println(" Would you like to add another item? ");
//		String itemAdded = addOneMoreItem.nextLine();
//		System.out.println(itemAdded);
//		if(itemAdded == "Yes") {
//			System.out.println(shopItem.addItem(shopItemName, new Item(shopItemPrice, quantityOfShopItem)));
//		}else {
//			System.out.println(shopItem.displayInventory(shopItem.myShop));
//
//		}
		
//		shopItem.addItem("blueband", new Item(10000,50.00));
//		shopItem.addItem("milk", new Item(3000,6.555));
//		shopItem.addItem("cooking oil", new Item(60000,27.789));
		//System.out.println(shopItem.myShop);
		System.out.println(shopItem.displayInventory(shopItem.myShop));
		
		
		
		Scanner update = new Scanner(System.in);
		System.out.println("Enter the item you want to update: ");
    	String itemUpdated = update.nextLine();
		System.out.println("Enter the new quantity of " + itemUpdated + ": ");
		double quantityOfItemUpdated = update.nextDouble();
		System.out.println(shopItem.updateQuantity(itemUpdated, quantityOfItemUpdated));
		System.out.println(shopItem.displayInventory(shopItem.myShop));
		shopItem.deleteInventory(shopItem.myShop, "milk");
		System.out.println(shopItem.displayInventory(shopItem.myShop));

	}

}
