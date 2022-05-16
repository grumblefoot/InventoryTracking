package Model;

public class ItemOrder {
	
	private int myCount = 0;
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
