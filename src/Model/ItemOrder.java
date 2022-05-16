package Model;

/**
 * This class holds information about how many of an item there are.
 * It could be expanded by making it sort by name or price 
 * if item sorting is a wanted function.
 * @author Rowan W Osmon
 * version 0.01
 *
 */
public class ItemOrder {
	
	/**
	 * How many of this item there are.
	 */
	private int myCount = 0;
	
	/**
	 * What item is it
	 */
	private Item myItem = null;
	
	ItemOrder(String name, int theCount){
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
