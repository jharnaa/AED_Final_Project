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
        private float Price;
    private CustomerApparel personaliseProduct;
    private int orderItemId;
    private static int count = 0;

    public PersonalisedOrderItem() {
        personaliseProduct = new CustomerApparel();
        count++;
        orderItemId = count;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public CustomerApparel getPersonaliseProduct() {
        return personaliseProduct;
    }

    public void setPersonaliseProduct(CustomerApparel personaliseProduct) {
        this.personaliseProduct = personaliseProduct;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    
    @Override
    public String toString() {
        return Integer.toString(this.orderItemId);
    }



    
}
