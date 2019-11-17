package com.shopping.discount;

/**
 * This is used to apply the discount of $5 for every 100 dollars in cart.
 */
public class ThresholdDiscount implements DiscountHandler {
	
	public static final int thresholdAmt = 100;

	@Override
	public double applyDiscount(double totalAmount) {
		
		if (totalAmount < thresholdAmt)
		{
			return totalAmount;
		}
		int discountFactor = (int) totalAmount / 100;
		double discount = discountFactor * 5;
		return totalAmount - discount; 
	}

}
