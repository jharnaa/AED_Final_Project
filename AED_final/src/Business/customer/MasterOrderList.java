/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.customer;

import java.util.ArrayList;

/**
 *
 * @author mrunalbhalerao
 */
public class MasterOrderList {

    ArrayList<PersonalisedOrder> listOfPersonalisedOrders;
    ArrayList<OrderOnline> listOfOnlineOrders;

    public MasterOrderList() {
        listOfPersonalisedOrders = new ArrayList<>();
        listOfOnlineOrders = new ArrayList<>();
    }

    public ArrayList<PersonalisedOrder> getListOfPersonalisedOrders() {
        return listOfPersonalisedOrders;
    }

    public void setListOfPersonalisedOrders(ArrayList<PersonalisedOrder> listOfPersonalisedOrders) {
        this.listOfPersonalisedOrders = listOfPersonalisedOrders;
    }

    public ArrayList<OrderOnline> getListOfOnlineOrders() {
        return listOfOnlineOrders;
    }

    public void setListOfOnlineOrders(ArrayList<OrderOnline> listOfOnlineOrders) {
        this.listOfOnlineOrders = listOfOnlineOrders;
    }

    public PersonalisedOrder addOrder() {
        PersonalisedOrder order = new PersonalisedOrder();
        listOfPersonalisedOrders.add(order);
        return order;
    }

    public void addOrderFromInput(PersonalisedOrder order) {
        listOfPersonalisedOrders.add(order);
    }

    public void removePersonalisedOrder(PersonalisedOrder order) {
        listOfPersonalisedOrders.remove(order);
    }

    public OrderOnline addOrderOnline() {
        OrderOnline oas = new OrderOnline();
        listOfOnlineOrders.add(oas);
        return oas;
    }

    public void addOnlineOrder(OrderOnline oas) {
        listOfOnlineOrders.add(oas);
    }

    public void removeOrderOnline(OrderOnline oas) {
        listOfOnlineOrders.remove(oas);
    }

}
