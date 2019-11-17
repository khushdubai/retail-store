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
        Item otherItem = new Product("Mobile", 1000, ItemType.OTHER);
        
        DiscountHandler discountHandler = new ThresholdDiscount();
        
        Cart cart = new Cart(employee, discountHandler);
        cart.add(groceryItem, 5);
        cart.add(otherItem, 3);
        /*
         *  Total (20 * 4) + (222 * 4) = 968
         *  No discount on grocery items = 968 still
         *  After 30% discount on 4 other items totalling 888 = 701.6
         *  After 35 dollars off due to price over $700 = 666.59999 or 666.6 
         */
        System.out.println(cart.total());        
    }
}