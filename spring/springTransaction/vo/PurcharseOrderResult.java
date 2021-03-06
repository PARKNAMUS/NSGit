package park.spring.store.vo;

public class PurcharseOrderResult {
	private Item item;
	private PaymentInfo paymentInfo;
	private PurchaseOrder order;
	
	public PurcharseOrderResult(Item item, PaymentInfo paymentInfo, PurchaseOrder order) {
		super();
		this.item = item;
		this.paymentInfo = paymentInfo;
		this.order = order;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public PaymentInfo getPaymentInfo() {
		return paymentInfo;
	}

	public void setPaymentInfo(PaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}

	public PurchaseOrder getOrder() {
		return order;
	}

	public void setOrder(PurchaseOrder order) {
		this.order = order;
	}
	
	
}
