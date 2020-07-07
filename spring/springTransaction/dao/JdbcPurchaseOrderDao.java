package park.spring.store.dao.jdbc;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import park.spring.store.dao.PurchaseOrderDao;
import park.spring.store.vo.PaymentInfo;
import park.spring.store.vo.PurchaseOrder;

public class JdbcPurchaseOrderDao implements PurchaseOrderDao{
	private SimpleJdbcInsert insert;
	private NamedParameterJdbcTemplate namedJdbcTemplate;
	
	public JdbcPurchaseOrderDao(SimpleJdbcInsert insert) {
		super();
		this.insert = insert;
		this.insert.withTableName("purchase_order").usingColumns("purchase_order_id","item_id","payment_info_id","address");
	}

	public void setNamedJdbcTemplate(NamedParameterJdbcTemplate namedJdbcTemplate) {
		this.namedJdbcTemplate = namedJdbcTemplate;
	}
	public Integer nextVal() {
		Map<String, Object> map = new HashMap<String, Object>();
		return namedJdbcTemplate.queryForObject("select purchase_seq.nextval from dual",map, Integer.class);
	}
	@Override
	public void insert(PurchaseOrder order) {
		System.out.println(1);
		Map<String, Object> param = new HashMap<String, Object>();
		param.put("purchase_order_id", nextVal());
		param.put("item_id", order.getItemId());
		param.put("payment_info_id",order.getPaymentInfoId());
		param.put("address",order.getAddress());
		insert.execute(param);
		
	}

}
