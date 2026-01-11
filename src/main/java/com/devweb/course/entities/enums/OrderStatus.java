package com.devweb.course.entities.enums;

public enum OrderStatus {
	WAITING_PAYMENT(1), //aguardando pagamento
	PAID(2), //pago
	PACKING(3), //empacotando
	SHIPPED(4), //enviado
	DELIVERED(5), //entregue
	CANCELED(6); //cancelado
	
	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOf(int code) {
		for(OrderStatus x: OrderStatus.values()) {
			if(x.getCode() == code) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Invalid OrderStatus code!");
	}
}
