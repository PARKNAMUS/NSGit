package park.spring.guestbook.dao;

import java.util.List;

import park.spring.guestbook.vo.GuestMessage;

public interface GuestMessageDao {
	public int count();
	public List<GuestMessage> select(int begin, int end);
	public int insert(GuestMessage message);
	public int delete(int id);
	public int update(GuestMessage message);
}
