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
public class ClothFactoryOrderItem {
    private ClothFactoryProduct clothFactoryProduct;
    private int orderItemId;
    private static int count = 0;

    public ClothFactoryOrderItem() {
        clothFactoryProduct = new ClothFactoryProduct();
        count++;
        orderItemId = count;
    }

    public ClothFactoryProduct getClothFactoryProduct() {
        return clothFactoryProduct;
    }

    public void setClothFactoryProduct(ClothFactoryProduct clothFactoryProduct) {
        this.clothFactoryProduct = clothFactoryProduct;
    }

    public int getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        ClothFactoryOrderItem.count = count;
    }

    @Override
    public String toString() {
        return Integer.toString(this.orderItemId);
    }


    

    
}
