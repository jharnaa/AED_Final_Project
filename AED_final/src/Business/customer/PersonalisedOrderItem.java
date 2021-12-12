/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.customer;

/**
 *
 * @author jharnadoda
 */
public class PersonalisedOrderItem {
    
    private CustomerApparel personaliseProduct;
    private int orderItemId;
    private float price;
    
    private static int count = 0;
    

    public PersonalisedOrderItem() {
        personaliseProduct = new CustomerApparel();
        count++;
        orderItemId = count;
    }
    
    public CustomerApparel getPersonaliseProduct() {
        return personaliseProduct;
    }

    public void setPersonaliseProduct(CustomerApparel personaliseProduct) {
        this.personaliseProduct = personaliseProduct;
    }
    

    public int getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        PersonalisedOrderItem.count = count;
    }

    
    @Override
    public String toString() {
        return Integer.toString(this.orderItemId);
    }



    
}
