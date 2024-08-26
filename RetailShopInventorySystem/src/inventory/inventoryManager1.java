package inventory;

public interface inventoryManager1 {
	public String addItem(String nameOfTheItem, Item priceQuantity );
	public String updateQuantity(String itemWhoseQtyUpdated, double updateQuantity);
	public String displayInventory( String displayNameOfTheItem, int displayPriceOfTheItem, double displayQuantityOfTheItem);
	public String deleteInventory();
}
