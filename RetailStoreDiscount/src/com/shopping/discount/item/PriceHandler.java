package com.shopping.discount.item;

import com.shopping.core.Item;
import com.shopping.core.ItemType;

/*
 * Class to implement pricing at item level
 */
public class PriceHandler implements Item {

    private final Item baseItem;

    public PriceHandler(Item baseItem) {
        this.baseItem = baseItem;
    }

    public double getUnitPrice() { 
    	return baseItem.getUnitPrice();
    }

    public String getName() { 
    	return baseItem.getName(); 
    }
    
    public ItemType getType() {
    	return baseItem.getType(); 
    }

    public double priceForQuantity(int quantity) {
        return baseItem.priceForQuantity(quantity);
    }
}
