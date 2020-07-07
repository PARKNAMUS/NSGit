package park.spring.store.dao.jdbc;

import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import park.spring.store.dao.PaymentInfoDao;
import park.spring.store.vo.PaymentInfo;

public class JdbcPaymentInfoDao implements PaymentInfoDao{
	private SimpleJdbcInsert insert;
	private NamedParameterJdbcTemplate namedJdbcTemplate;
	
	public JdbcPaymentInfoDao(SimpleJdbcInsert insert) {
		super();
		this.insert = insert;
		this.insert.withTableName("payment_info").usingColumns("payment_info_id","price");
	}

	public void setNamedJdbcTemplate(NamedParameterJdbcTemplate namedJdbcTemplate) {
		this.namedJdbcTemplate = namedJdbcTemplate;
	}
	public Integer nextVal() {
		Map<String, Object> map = new HashMap<String, Object>();
		return namedJdbcTemplate.queryForObject("select payment_seq.nextval from dual",map , Integer.class);
	}
	@Override
	public void insert(PaymentInfo paymentInfo) {
		Map<String, Object> param = new HashMap<String, Object>();
		int a = nextVal();
		int b = paymentInfo.getPrice();
		param.put("payment_info_id",a);
		param.put("price",b);
		namedJdbcTemplate.update("insert into payment_info(payment_info_id,price) values(:payment_info_id,:price)", param);
	}

}
