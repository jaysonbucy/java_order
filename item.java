/**
* Represents a part or service that can be sold.
* care should be taken to ensure that this class is immutable since it
* is sent to other systems for processing that should not be able to
* change it in any way.
*/
package com.exam;

public class Item {

  private Integer key;
  private String name;
  private float price;

  public Item(Integer key, String name, float price)  {
    this.key = key;
    this.name = name;
    this.price = price;
  }

  public Integer getKey()  {
    return key;
  }
  
  public String getName()  {
    return name;
  }

  public float getPrice()  {
    return price;
  }

}