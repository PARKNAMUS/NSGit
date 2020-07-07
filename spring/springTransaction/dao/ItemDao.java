package park.spring.store.dao;

import park.spring.store.vo.Item;

public interface ItemDao {
	Item findById(int itemId);
}
