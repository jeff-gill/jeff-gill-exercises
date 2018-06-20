
//INTERFACE

package com.techelevator.postage;

import java.math.BigDecimal;

public interface IDeliveryDriver {

	BigDecimal calculateRate(int distance, int weight);
	
	String getCompanyName();
}