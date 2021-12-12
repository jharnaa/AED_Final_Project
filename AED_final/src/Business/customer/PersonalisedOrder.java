/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.customer;

import business.person.Person;
import java.util.ArrayList;
/**
 *
 * @author jharnadoda
 */

public class PersonalisedOrder {
    private ArrayList<PersonalisedOrderItem> orderItemList;
    private Person customer;
    private int orderNumber;
    private static int count;

    public PersonalisedOrder() {
        count++;
        orderNumber = count;
        orderItemList = new ArrayList<>();
    }

    public ArrayList<PersonalisedOrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<PersonalisedOrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getOrderNmuber() {
        return orderNumber;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        PersonalisedOrder.count = count;
    }

    public Person getCustomer() {
        return customer;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }

    public PersonalisedOrderItem addPersonalisedOrderItem() {
        PersonalisedOrderItem co = new PersonalisedOrderItem();
        orderItemList.add(co);
        return co;
    }

    public void removeOrderItem(PersonalisedOrderItem coi) {
        orderItemList.remove(coi);
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    
    @Override
    public String toString() {
        return Integer.toString(orderNumber);
    }



    
}
