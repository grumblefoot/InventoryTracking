package Model;

import java.util.HashMap;
import java.util.Map;

/**
 * This class is used to track how many and what items are in a warehouse.
 * @author Rowan W Osmon
 * version 0.01
 */
public class Warehouse {
	
	/**
	 * The HashMap is used to quickly retrieve information about an item and to manage the inventory
	 */
	private Map<String, ItemOrder> myStorage = new HashMap<String, ItemOrder>();
	
	/**
	 * This string holds the warehouse name/location 
	 * so that multiple warehouses can be easily distinguished.
	 */
	private String myLocation;
	private String myPositionInArray;
	
	public Warehouse(String theLocation) {
		setMyLocation(theLocation);
		
	}
	
	/**
	 * This method creates an item, sets how many of it there are, and adds them to the warehouse storage.
	 * @param name The name of the item to be stored.
	 * @param count The number of items in the inventory.
	 */
	public void createInventoryItem(String name, int count) {
		myStorage.put(name, new ItemOrder(name,count));
	}
	
	/**
	 * This method edits an item in the storage.
	 * @param name The item name to be edited.
	 * @param count The number of items to set the inventory to.
	 */
	public void editInventoryItem(String name, int count) {
		ItemOrder edit = new ItemOrder(name, count);
		myStorage.put(name, edit);
	}
	
	/**
	 * This method deletes an item from the storage
	 * @param name The name of the item to be removed.
	 */
	public void deleteInventoryItem(String name) {
		myStorage.remove(name);
	}
	
	/**
	 * This method lists all items stored in this warehouse, and how many of each there are.
	 * @return A string with the item names and counts.
	 */
	public String viewItems() {
		StringBuilder sb = new StringBuilder();
		for (String s: myStorage.keySet()) {
			sb.append("Item name: " + s + "\n Item Count: " + myStorage.get(s).getCount() + "\n");
		}
		return sb.toString();
	}
	
	public String getMyLocation() {
		return myLocation;
	}

	private void setMyLocation(String myLocation) {
		this.myLocation = myLocation;
	}

	public String getMyPositionInArray() {
		return myPositionInArray;
	}

	public void setMyPositionInArray(String myPositionInArray) {
		this.myPositionInArray = myPositionInArray;
	}
	
}
