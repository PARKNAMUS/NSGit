package park.spring.guestbook.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import park.spring.guestbook.vo.GuestMessage;

public class JdbcTemplateGuestMessageDao implements GuestMessageDao{
	
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplateGuestMessageDao(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
	}
	
	@Override
	public int count() {
		
		return jdbcTemplate.queryForObject("select count(*) from guestbook", Integer.class);
	}

	@Override
	public List<GuestMessage> select(int begin, int end) {
		
		return jdbcTemplate.query("select * from (select ROWNUM rnum,message_id,guest_name,message,registry_date from (select * from guestbook order by message_id desc)) where rnum>=? and rnum<=?", new Object[] {begin,end},new GuestMessageRowMapper());
	}

	@Override
	public int insert(GuestMessage message) {
		Object [] object = {message.getGuestName(),message.getMessage(),message.getRegistryDate()};
		return jdbcTemplate.update("insert into guestbook(message_id,guest_name,message,registry_date) values(guest_seq.nextval,?,?,?)",object);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("delete from guestbook where message_id = ?",id);
	}

	@Override
	public int update(GuestMessage message) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("update guestbook set message = ? where message_id = ?",message.getMessage(),message.getId());
	}

}
