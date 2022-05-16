package Model;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {

	private Map<String, ItemOrder> myStorage = new HashMap<String, ItemOrder>();
	private String myLocation;
	
	public Warehouse(String theLocation) {
		setMyLocation(theLocation);
	}
	
	public void createInventoryItem(String name, int count) {
		myStorage.put(name, new ItemOrder(name,count));
	}
	
	public void editInventoryItem(String name, int count) {
		ItemOrder edit = new ItemOrder(name, count);
		myStorage.put(name, edit);
	}
	
	public void deleteInventoryItem(String name) {
		myStorage.remove(name);
	}
	
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

	public void setMyLocation(String myLocation) {
		this.myLocation = myLocation;
	}
	
}
