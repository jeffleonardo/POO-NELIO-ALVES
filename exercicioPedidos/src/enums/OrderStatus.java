package enums;

public enum OrderStatus {
	
	PENDING_PAYMENT,
	PROCESSING,
	SHIPPED,
	DELIVERED;

	public OrderStatus setStatus(int valor) {
		
		if(valor == 0) return PENDING_PAYMENT;
		if(valor == 1) return PROCESSING;
		if(valor == 2) return SHIPPED;
		if(valor == 3) return DELIVERED;
	
		return null;	
	}
}
