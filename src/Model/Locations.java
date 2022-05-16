package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * This class creates and stores information about warehouses. 
 * @author icein
 *
 */
public class Locations {
	
	/**
	 * This is the list of all known warehouses
	 */
	public List<Warehouse> locations = new ArrayList<Warehouse>();
	
	public Locations(){
		
	}
	
	/**
	 * This method adds a new warehouse location.
	 * @param name The name/location of the warehouse
	 */
	public void addLocation(String name) {
		locations.add(new Warehouse(name));
	}
	
	/**
	 * This method lists all locations and their inventories.
	 * @return a string containing all warehouse names/locations and the inventories in each.
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
