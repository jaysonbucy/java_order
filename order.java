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
    this. orderItems = orderItems;
  }

  // Returns the total order cost after the tax has been applied
  public float getOrderTotal(float taxRate)  {
    return 0; // implement this method
  }

  //Returns a Collection of all items sorted by item name (case-insensitive).
  public Collection getItems()  {
    return null; // implement this method
  }
}