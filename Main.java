import java.util.*;

/**
 * This Class runs the app and its tests.
 * 
 * @author Rowan W Osmon version 0.02
 *
 */
public class Main {

  /**
   * This class holds information about items. Currently it just stores the item
   * name, but it could also store information such as price
   * 
   * @author Rowan W Osmon version 0.02
   */
  class Item {

    /**
     * The item name
     */
    private String myName;

    Item(String name) {
      myName = name;
    }

    public String toString() {
      return myName;
    }
  }

  /**
   * This class holds information about how many of an item there are. It could be
   * expanded by making it sort by name or price if item sorting is a wanted
   * function.
   * 
   * @author Rowan W Osmon version 0.02
   *
   */
  class ItemOrder {

    /**
     * How many of this item there are.
     */
    private int myCount = 0;

    /**
     * What item is it
     */
    private Item myItem = null;

    ItemOrder(String name, int theCount) {
      setItem(new Item(name));
      setCount(theCount);
    }

    public int getCount() {
      return myCount;
    }

    public void setCount(int myCount) {
      this.myCount = myCount;
    }

    public Item getItem() {
      return myItem;
    }

    public void setItem(Item myItem) {
      this.myItem = myItem;
    }

  }

  /**
   * This class creates and stores information about warehouses.
   * 
   * @author Rowan W Osmon version 0.02
   *
   */
  class Locations {

    /**
     * This is the list of all known warehouses
     */
    public ArrayList<Warehouse> locations = new ArrayList<Warehouse>();

    public Locations() {

    }

    /**
     * This method adds a new warehouse location.
     * 
     * @param name The name/location of the warehouse
     */
    public void addLocation(String name) {
      locations.add(new Warehouse(name));
    }

    /**
     * This method lists all locations and their inventories.
     * 
     * @return a string containing all warehouse names/locations and the inventories
     *         in each.
     */
    public String viewLocations() {
      StringBuilder sb = new StringBuilder();
      for (Warehouse w : locations) {
        sb.append(w.getMyLocation() + "\n");
        sb.append(w.viewItems());
      }
      return sb.toString();
    }
  }

  /**
   * This class is used to track how many and what items are in a warehouse.
   * 
   * @author Rowan W Osmon version 0.01
   */
  class Warehouse {

    /**
     * The HashMap is used to quickly retrieve information about an item and to
     * manage the inventory
     */
    private Map<String, ItemOrder> myStorage = new HashMap<String, ItemOrder>();

    /**
     * This string holds the warehouse name/location so that multiple warehouses can
     * be easily distinguished.
     */
    private String myLocation;
    
    public Warehouse(String theLocation) {
      setMyLocation(theLocation);
    }

    /**
     * This method creates an item, sets how many of it there are, and adds them to
     * the warehouse storage.
     * 
     * @param name  The name of the item to be stored.
     * @param count The number of items in the inventory.
     */
    public void createInventoryItem(String name, int count) {
      myStorage.put(name, new ItemOrder(name, count));
    }

    /**
     * This method edits an item in the storage.
     * 
     * @param name  The item name to be edited.
     * @param count The number of items to set the inventory to.
     */
    public void editInventoryItem(String name, int count) {
      ItemOrder edit = new ItemOrder(name, count);
      myStorage.put(name, edit);
    }

    /**
     * This method deletes an item from the storage
     * 
     * @param name The name of the item to be removed.
     */
    public void deleteInventoryItem(String name) {
      myStorage.remove(name);
    }

    /**
     * This method lists all items stored in this warehouse, and how many of each
     * there are.
     * 
     * @return A string with the item names and counts.
     */
    public String viewItems() {
      StringBuilder sb = new StringBuilder();
      for (String s : myStorage.keySet()) {
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


  public static void main(String[] args) {
    Main tester = new Main();
    
    tester.testCreateInventory();
    tester.testEditInventory();
    tester.testDeleteInventory();
    tester.testMultiLocations();
  }

  /**
   * This tests the creation of inventory items
   */
  public void testCreateInventory() {
    Warehouse test = new Warehouse("test");
    System.out.println("Starting createInventory test");
    test.createInventoryItem("Playstation", 1);
    test.createInventoryItem("Bicycle", 5);
    System.out.println(test.viewItems());
  }

  /**
   * This tests the edit method for items
   */
  public void testEditInventory() {
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
  public void testDeleteInventory() {
    System.out.println("Starting deleteInventory test");
    Warehouse test = new Warehouse("test");
    test.createInventoryItem("Playstation", 1);
    test.createInventoryItem("Bicycle", 5);
    System.out.println(test.viewItems());
    test.deleteInventoryItem("Playstation");
    System.out.println(test.viewItems());
  }

  /**
   * This tests the multiple warehouse functionality.
   */
  public void testMultiLocations() {
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
