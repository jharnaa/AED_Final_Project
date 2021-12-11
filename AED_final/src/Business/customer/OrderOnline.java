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


public class OrderOnline {
    private ArrayList<ClothFactoryOrderItem> listOfClothOrders;
    private Person customer;
    private int orderNumber;
    private static int count = 0;

    public OrderOnline() {
        count++;
        orderNumber = count;
        listOfClothOrders = new ArrayList<>();
    }

    public ArrayList<ClothFactoryOrderItem> getListOfClothOrders() {
        return listOfClothOrders;
    }

    public void setListOfClothOrders(ArrayList<ClothFactoryOrderItem> listOfClothOrders) {
        this.listOfClothOrders = listOfClothOrders;
    }

    public Person getCustomer() {
        return customer;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        OrderOnline.count = count;
    }

    public ClothFactoryOrderItem addClothOrderItem() {
       ClothFactoryOrderItem cfoi = new ClothFactoryOrderItem();
        listOfClothOrders.add(cfoi);
        return cfoi;
    }

    public void removeClothOrderItem(ClothFactoryOrderItem cfoi) {
        listOfClothOrders.remove(cfoi);
    }

    public String toString() {
        return Integer.toString(this.orderNumber);
    }
    

    
}
