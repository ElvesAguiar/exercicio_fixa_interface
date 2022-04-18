package model.services;

import model.interfaces.OnlinePaymentService;

public class PaypalService implements OnlinePaymentService {

	@Override
	public Double paymentFee(Double amount) {
		
		double aux = amount;
		
		return null ;
	}

	@Override
	public Double interest(Double amount, Integer months) {
		return null;
	}
	
}
