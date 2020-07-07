package park.spring.store.service;

import park.spring.store.vo.ItemNotFoundException;
import park.spring.store.vo.PurcharseOrderResult;
import park.spring.store.vo.PurchaseOrderRequest;

public interface PlaceOrderService {
	public PurcharseOrderResult order(PurchaseOrderRequest orderRequest) throws ItemNotFoundException;
	
}
