
//INTERFACE

package com.techelevator.postage;

import java.math.BigDecimal;

public interface IDeliveryDriver {

	BigDecimal calculateRate(BigDecimal distance, int weight);
}