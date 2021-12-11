/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.customer.OrderOnline;
import business.workqueue.WorkRequest;

/**
 *
 * @author mrunalbhalerao
 */
public class OrderOnlineWorkRequest extends WorkRequest{
    
    public OrderOnlineWorkRequest(){
        
        super(WorkRequest.WorkRequestType.OrderOnline.getValue());
    }
    
    private OrderOnline OrderOnline;

    public OrderOnline getOrderOnline() {
        return OrderOnline;
    }

    public void setOrderOnline(OrderOnline OrderOnline) {
        this.OrderOnline = OrderOnline;
    }

    

    @Override
    public String toString() {
        return Integer.toString(OrderOnline.getOrderNumber());
    }
}
