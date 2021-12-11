/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.customer.PersonalisedOrder;
import business.useraccount.UserAccount;
import business.workqueue.WorkRequest;

/**
 *
 * @author mrunalbhalerao
 */
public class CustomerCustomizedWorkRequest extends WorkRequest {
    
    private PersonalisedOrder order;
    private UserAccount customerSender;
    private UserAccount storeReceiver;
    private UserAccount storeSender;
    private UserAccount designerReceiver;
    private UserAccount designerSender;

    public PersonalisedOrder getOrder() {
        return order;
    }

    public void setOrder(PersonalisedOrder order) {
        this.order = order;
    }
    private UserAccount manufacturerReceiver;
    private UserAccount manufacturerSender;
    private UserAccount customerReceiver;

    public CustomerCustomizedWorkRequest() {
        super(WorkRequest.WorkRequestType.CustomerCustomized.getValue());

    }


    public UserAccount getCustomerSender() {
        return customerSender;
    }

    public void setCustomerSender(UserAccount customerSender) {
        this.customerSender = customerSender;
    }

    public UserAccount getStoreReceiver() {
        return storeReceiver;
    }

    public void setStoreReceiver(UserAccount storeReceiver) {
        this.storeReceiver = storeReceiver;
    }

    public UserAccount getStoreSender() {
        return storeSender;
    }

    public void setStoreSender(UserAccount storeSender) {
        this.storeSender = storeSender;
    }

    public UserAccount getDesignerReceiver() {
        return designerReceiver;
    }

    public void setDesignerReceiver(UserAccount designerReceiver) {
        this.designerReceiver = designerReceiver;
    }

    public UserAccount getDesignerSender() {
        return designerSender;
    }

    public void setDesignerSender(UserAccount designerSender) {
        this.designerSender = designerSender;
    }

    public UserAccount getManufacturerReceiver() {
        return manufacturerReceiver;
    }

    public void setManufacturerReceiver(UserAccount manufacturerReceiver) {
        this.manufacturerReceiver = manufacturerReceiver;
    }

    public UserAccount getManufacturerSender() {
        return manufacturerSender;
    }

    public void setManufacturerSender(UserAccount manufacturerSender) {
        this.manufacturerSender = manufacturerSender;
    }

    public UserAccount getCustomerReceiver() {
        return customerReceiver;
    }

    public void setCustomerReceiver(UserAccount customerReceiver) {
        this.customerReceiver = customerReceiver;
    }

    @Override
    public String toString() {
        return String.valueOf(this.order.getOrderNmuber());
    }
    
}
