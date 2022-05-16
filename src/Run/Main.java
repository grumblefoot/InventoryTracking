package Run;
import Model.Locations;
import Model.Warehouse;

/**
 * This Class runs the app and its tests.
 * @author Rowan W Osmon
 * version 0.01
 *
 */
public class Main {

	public static void main(String[] args) {
		testCreateInventory();
		testEditInventory();
		testDeleteInventory();
		testMultiLocations();
	}
	
	/**
	 * This tests the creation of inventory items
	 */
	public static void testCreateInventory() {
		System.out.println("Starting createInventory test");
		Warehouse test = new Warehouse("test");
		test.createInventoryItem("Playstation", 1);
		test.createInventoryItem("Bicycle", 5);
		System.out.println(test.viewItems());
	}
	
	/**
	 * This tests the edit method for items
	 */
	public static void testEditInventory() {
		System.out.println("Starting editInventory test");
		Warehouse test = new Warehouse("test");
		test.createInventoryItem("Playstation", 1);
		test.createInventoryItem("Bicycle", 5);
		System.out.println(test.viewItems());
		test.editInventoryItem("Playstation", 10);
		System.out.println(test.viewItems());
	}
	
	/**
	 * This tests the delete function
	 */
	public static void testDeleteInventory() {
		System.out.println("Starting deleteInventory test");
		Warehouse test = new Warehouse("Test");
		test.createInventoryItem("Playstation", 1);
		test.createInventoryItem("Bicycle", 5);
		System.out.println(test.viewItems());
		test.deleteInventoryItem("Playstation");
		System.out.println(test.viewItems());
	}
	
	/**
	 * This tests the multiple warehouse functionality.
	 */
	public static void testMultiLocations() {
		System.out.println("Starting multiWarehouse test");
		Locations testLocation = new Locations();
		testLocation.addLocation("WestWarehouse");
		testLocation.addLocation("EastWarehouse");
		System.out.println(testLocation.viewLocations());
		testLocation.locations.get(0).createInventoryItem("BasketBall", 50);
		testLocation.locations.get(1).createInventoryItem("XBox", 16);
		System.out.println(testLocation.viewLocations());
	}
	
}
