package park.spring.guestbook.dao;

import java.sql.Types;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import park.spring.guestbook.vo.GuestMessage;

public class NameParamGuestMessageDao implements GuestMessageDao{
	private NamedParameterJdbcTemplate jdbcTemplate;
	private SimpleJdbcInsert insertMessage;
	
	NameParamGuestMessageDao(DataSource dataSource){
		jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
		insertMessage = new SimpleJdbcInsert(dataSource);
		insertMessage.withTableName("guestbook");
		insertMessage.usingColumns("message_id","guest_name","message","registry_date");
	}
	@Override
	public int count() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		return jdbcTemplate.queryForObject("select count(*) from guestbook", map,Integer.class);
	}

	@Override
	public List<GuestMessage> select(int begin, int end) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("begin",begin);
		map.put("end", end-begin+1);
		return jdbcTemplate.query("select * from (select ROWNUM rnum,message_id,guest_name,message,registry_date from (select * from guestbook order by message_id desc)) where rnum>=:begin and rnum<=:end",
			map,new GuestMessageRowMapper());
	}

	@Override
	public int insert(GuestMessage message) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("message_id", getSeq());
		map.put("guest_name", message.getGuestName());
		map.put("message", message.getMessage());
		map.put("registry_date", message.getRegistryDate());
		return insertMessage.execute(map);
	}
	private int getSeq() {
		Map<String,Object> paramMap = new HashMap<String, Object>();
		return jdbcTemplate.queryForObject("select guest_seq.nextval from dual", paramMap, Integer.class);
	}

	@Override
	public int delete(int id) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("id",id);
		return jdbcTemplate.update("delete from guestbook where message_id = :id",map);
	}

	@Override
	public int update(GuestMessage message) {
		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("message",message.getMessage());
		paramSource.addValue("id",message.getId(),Types.INTEGER);
		return jdbcTemplate.update("update guestbook set message = :message where message_id = :id",paramSource);
	}
}
