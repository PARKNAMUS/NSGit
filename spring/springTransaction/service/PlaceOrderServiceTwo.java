package park.spring.store.service;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import park.spring.store.dao.ItemDao;
import park.spring.store.dao.PurchaseOrderDao;
import park.spring.store.dao.jdbc.JdbcPaymentInfoDao;
import park.spring.store.vo.Item;
import park.spring.store.vo.ItemNotFoundException;
import park.spring.store.vo.PaymentInfo;
import park.spring.store.vo.PurcharseOrderResult;
import park.spring.store.vo.PurchaseOrder;
import park.spring.store.vo.PurchaseOrderRequest;

public class PlaceOrderServiceTwo implements PlaceOrderService{
	private ItemDao itemDao;
	private JdbcPaymentInfoDao paymentInfoDao;
	private PurchaseOrderDao purchaseOrderDao;
	private TransactionTemplate transactionTemplate;
	public void setItemDao(ItemDao itemDao) {
		this.itemDao = itemDao;
	}

	public void setPaymentInfoDao(JdbcPaymentInfoDao paymentInfoDao) {
		this.paymentInfoDao = paymentInfoDao;
	}

	public void setPurchaseOrderDao(PurchaseOrderDao purchaseOrderDao) {
		this.purchaseOrderDao = purchaseOrderDao;
	}
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	@Override
	public PurcharseOrderResult order(PurchaseOrderRequest orderRequest) throws ItemNotFoundException {
		// TODO Auto-generated method stub
		return transactionTemplate.execute(new TransactionCallback<PurcharseOrderResult>() {

			@Override
			public PurcharseOrderResult doInTransaction(TransactionStatus status) {
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
		});
	}

}
