This is a very simple coding example, no complicated algorithms. Our intent is to collect an example of your design and code so that we can discuss your approach to fulfilling the requirements. The purpose is to generate further discussion and explore your grasp of OO concepts and knowledge of the JDK. Present your response as you see fit.

## Program requirements:
 You are working on a team developing an e-commerce application. One of your tasks is to complete the implementation of the Order class that an intern has started along with any other class or classes on which it depends.

 1. The *Order* constructor requires an array of *OrderItems*.
 2. The business rules dictate that there are two types of order items required, service and material.
 3. There is one distinction between them, only material items are taxable.
 4. An instance of an *OrderItem* is only required to contain an *Item* and a quantity.
 5. An *Order*, once constructed, is _immutable_ (no one should be able to change it).
 6. The *Order* object also needs to be *Serializable* as it will be distributed across multiple VM’s.
 7. It is critical that the method that returns the order-total returns accurately to the nearest penny.
 8. There is an expected future requirement that *Items* be used as keys in a _Hashtable_ so address this issue now.
 9. Make any changes needed to the *Order* object to meet the requirements stated above, although you should not have to add any more public methods.
 10. This API will be used by many developers so implement all common methods.

 ## My Solution:
 1. Given
 2. I thought the easiest way to handle this was to add a ```private String orderType;``` to the class.
 3. With number 2 handled this lets us apply ```taxRate``` to the price of the item.
 4. Nothing really at this point to handle that I'm aware of.
 5. Set the class to ```final``` and did not use any ```setters``` which should render any orders immutable.
 6. Set the class to Serializable and imported the library
 7. I changed the type to ```BigDecimal``` which provides operations for rounding and is more accurate (or so I was instructed by the Java guru that taught me).
 8. This is bad programming practice. Don't ever code for expected cases. Do not write code that will not be used for a long time. It will be useless as the use case is to subject to change. Make the code robust against unexpected problems or fail-fast, but do not write code for possible future uses.