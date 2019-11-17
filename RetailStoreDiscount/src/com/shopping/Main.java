/**
 * 
 */
package com.shopping;

/**
 * @author Administrator
 * This is the Main Java to launch the application
 */
import com.shopping.core.Cart;
import com.shopping.core.Item;
import com.shopping.core.ItemType;
import com.shopping.core.Product;
import com.shopping.core.User;
import com.shopping.core.UserType;
import com.shopping.discount.DiscountHandler;
import com.shopping.discount.ThresholdDiscount;

class Main {
	
    public static void main (String[] args)
    {
    	
    	User employee = new User(UserType.EMPLOYEE, "test");
    	
        Item groceryItem = new Product("Bread", 10 , ItemType.GROCERY);
        Item otherItem = new Product("Mobile", 200, ItemType.OTHER);
        
        DiscountHandler discountHandler = new ThresholdDiscount();
        
        Cart cart = new Cart(employee, discountHandler);
        cart.add(groceryItem, 2);
        cart.add(otherItem, 2);
        /*
         * 
         *  No discount on grocery items
         *  After 30% discount- 285
         *   
         */
        System.out.println(cart.total());        
    }
}