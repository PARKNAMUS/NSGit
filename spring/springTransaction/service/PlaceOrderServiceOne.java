package park.spring.store.service;

import park.spring.store.dao.ItemDao;
import park.spring.store.dao.PurchaseOrderDao;
import park.spring.store.dao.jdbc.JdbcPaymentInfoDao;
import park.spring.store.vo.Item;
import park.spring.store.vo.ItemNotFoundException;
import park.spring.store.vo.PaymentInfo;
import park.spring.store.vo.PurcharseOrderResult;
import park.spring.store.vo.PurchaseOrder;
import park.spring.store.vo.PurchaseOrderRequest;

public class PlaceOrderServiceOne implements PlaceOrderService {
	private ItemDao itemDao;
	private JdbcPaymentInfoDao paymentInfoDao;
	private PurchaseOrderDao purchaseOrderDao;
	
	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}

	public void setPaymentInfoDao(JdbcPaymentInfoDao paymentInfoDao) {
		this.paymentInfoDao = paymentInfoDao;
	}

	public void setPurchaseOrderDao(PurchaseOrderDao purchaseOrderDao) {
		this.purchaseOrderDao = purchaseOrderDao;
	}

	@Override
	public PurcharseOrderResult order(PurchaseOrderRequest orderRequest) throws ItemNotFoundException {
		Item item = itemDao.findById(orderRequest.getItemId());
		if(item == null) {
			throw new ItemNotFoundException(orderRequest.getItemId());
		}
		PaymentInfo paymentInfo = new PaymentInfo(item.getPrice());
		paymentInfoDao.insert(paymentInfo);
		PurchaseOrder purchaseOrder = new PurchaseOrder(item.getId(), orderRequest.getAddress(), paymentInfo.getId());
		purchaseOrderDao.insert(purchaseOrder);
		return new PurcharseOrderResult(item, paymentInfo, purchaseOrder);
	}

}
