/**
* Represents and Order that contains a collection of items.
* care should be taken to ensure that this class is immutable since it
* is sent to other systems for processing that should not be able
* to change it in any way.
*/
package com.exam;
import java.util.*;
import java.io.Serializable;

public class Order implement Serializable {

  private OrderItem[] orderItems;

  public Order(OrderItem[]orderItems)  {
    this.orderItems = orderItems;
  }

  // Returns the total order cost after the tax has been applied
  public float getOrderTotal(float taxRate)  {
    int size = orderItems.length();
    int orderTotal = 0;

    for(i = 0; i < size; i++) {
      if(orderItem[i].orderType = "material") {
        orderItem[i].price += orderItem[i].price * taxRate;
      }
      orderTotal += orderItem[i].price
    }
    return orderTotal; // implement this method
  }

  //Returns a Collection of all items sorted by item name (case-insensitive).
  public Collection getItems()  {
    int size = orderItems.length();
    List<String> list = new ArrayList<String>;

    for(i = 0; i < size; i++) {
      list.add(orderItems[i].name);
    }
    return Collections.sort(list); // implement this method
  }
}