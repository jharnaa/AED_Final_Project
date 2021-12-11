/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.customer.ClothFactoryProduct;
import business.workqueue.WorkRequest;

/**
 *
 * @author mrunalbhalerao
 */
public class ClothFactoryProductWorkRequest extends WorkRequest {
    
    public ClothFactoryProductWorkRequest() {
        super(WorkRequest.WorkRequestType.ClothFactoryProduct.getValue());

    }
    private ClothFactoryProduct clothFactoryProduct;

    public ClothFactoryProduct getClothFactoryProduct() {
        return clothFactoryProduct;
    }

    public void setClothFactoryProduct(ClothFactoryProduct clothFactoryProduct) {
        this.clothFactoryProduct = clothFactoryProduct;
    }

    

    @Override
    public String toString() {
        return this.clothFactoryProduct.toString();
    }

    
}
