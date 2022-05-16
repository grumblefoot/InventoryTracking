package Model;

/**
 * This class holds information about items. 
 * Currently it just stores the item name, 
 * but it could also store information such as price
 * @author Rowan W Osmon
 * version 0.01
 */
public class Item {
	
	/**
	 * The item name
	 */
	private String myName;
	
	Item(String name){
		myName = name;
	}
	
	public String toString(){
		return myName;
	}
}
