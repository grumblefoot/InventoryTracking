package Run;
import Model.Locations;
import Model.Warehouse;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testCreateInventory();
		testEditInventory();
		testDeleteInventory();
		testMultiLocations();
	}
	
	public static void testCreateInventory() {
		System.out.println("Starting createInventory test");
		Warehouse test = new Warehouse("test");
		test.createInventoryItem("Playstation", 1);
		test.createInventoryItem("Bicycle", 5);
		System.out.println(test.viewItems());
	}
	
	public static void testEditInventory() {
		System.out.println("Starting editInventory test");
		Warehouse test = new Warehouse("test");
		test.createInventoryItem("Playstation", 1);
		test.createInventoryItem("Bicycle", 5);
		System.out.println(test.viewItems());
		test.editInventoryItem("Playstation", 10);
		System.out.println(test.viewItems());
	}
	
	public static void testDeleteInventory() {
		System.out.println("Starting deleteInventory test");
		Warehouse test = new Warehouse("Test");
		test.createInventoryItem("Playstation", 1);
		test.createInventoryItem("Bicycle", 5);
		System.out.println(test.viewItems());
		test.deleteInventoryItem("Playstation");
		System.out.println(test.viewItems());
	}
	
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
