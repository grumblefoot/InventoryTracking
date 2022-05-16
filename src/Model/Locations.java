package Model;

import java.util.ArrayList;
import java.util.List;

public class Locations {

	public List<Warehouse> locations = new ArrayList<Warehouse>();
	
	public Locations(){
		
	}
	
	public void addLocation(String name) {
		locations.add(new Warehouse(name));
	}
	
	public String viewLocations() {
		StringBuilder sb = new StringBuilder();
		for (Warehouse w : locations) {
			sb.append(w.getMyLocation() + "\n");
			sb.append(w.viewItems());
		}
		return sb.toString();
	}
}
