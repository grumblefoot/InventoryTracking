# InventoryTracking
A simple proof of concept InventoryControl system

How to use:
Run the program with Main.java

The program should preform some simple tests.

To manage a single "Warehouse" first create a new instance of a Warehouse.

  ex: Warehouse myWarehouse = new Warehouse("theWarehouseNameOrLocation");
  
  You can add an item to the warehouse inventory with Warehouse.createInventoryItem("theItemName", i); where i is an integer of how many items you want to stock.
  
  You can edit an item in the Warehouse Inventory with Warehouse.editInventoryItem("theItemName", i);
  
  You can delete an item from the Warehouse Inventory with Warehouse.deleteInventoryItem("theItemName");
  
  You can get a string with all the items in the Warehouse with Warehouse.viewItems();
  
  You can get a string of the Warehouse name/location with Warehouse.getMyLocation();
  
  
To create and manage multiple warehouse create a new "Locations"

  ex: Locations myLocations = new Locations();
  
  Then you can add Warehouses with myLocations.addLocation("theWarehouseNameOrLocation");
  
    This creates a new WareHouse with the name "theWarehouseNameOrLocation"
    
  You can retrive a string that lists all Warehouses and their inventorys with myLocations.viewLocations();
  
  You can access an ArrayList of Warehouse's to modify the contents of an indvidual Warehouse with myLocations.getLocations().get(i) 
      where i is the location of the warehouse in the list.
 
