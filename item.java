package com.exam;
/**
* Represents a part or service that can be sold.
*
* care should be taken to ensure that this class is immutable since it
* is sent to other systems for processing that should not be able to
* change it in any way.
*
* &lt;p&gt;Copyright: Copyright (c) 2004&lt;/p&gt;
* &lt;p&gt;Company: Exams are us&lt;/p&gt;
* @author Joe Blow
* @version 1.0
*/
public class Item
{
private Integer key;
private String name;
private float price;


public Item(Integer key, String name, float price)
{
this.key = key;
this.name = name;
this.price = price;
}

public Integer getKey()
{
return key;
}
public String getName()
{
return name;
}
public float getPrice()
{
return price;
}
}