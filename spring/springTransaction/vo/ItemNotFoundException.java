package park.spring.store.vo;

public class ItemNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private int itemId;
	public ItemNotFoundException(int itemId) {
		super("not found item: id= "+itemId);
		this.itemId = itemId;
	}
	public int getItemId() {
		return itemId;
	}
	
	
}
