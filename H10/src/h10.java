/* Author - Christian Ramsey Professor Tong 11/6/2022
 * In this assignment, we were instructed to create a program that displayed shipping for 3 orders, based on the status
 * they were. The most important part of this assignment was setting up the Order.java class correctly to then implement it into the 
 * main method. You had to utilize multiple methods to display all of the correct information for each respective order. The last, important 
 * step was using the toString method in the Order class to display all of the required information.
 * 
 */
public class h10 {
	public static void main(String[] args) {
		
		//order 1
        Order order1 = new Order("First Order");
        order1.ship();//ship order
        order1.setShippingAddress("1324");
        order1.setBillingAddress("Washington Lane");
        order1.setPhoneNumber("777-777-7777");

        //order 2
        Order order2 = new Order("Second Order");
        order2.cancel(); //cancel order
        order2.setShippingAddress("2222");
        order2.setBillingAddress("2nd Street");
        order2.setPhoneNumber("506-907-4455");

        //order 3
        Order order3 = new Order("Third Order");
        order3.setShippingAddress("8585");
        order3.setBillingAddress("85th Avenue");
        order3.setPhoneNumber("801-382-2937");

        // print orders
        System.out.println(order1.toString());
        System.out.println(order2.toString());
        System.out.println(order3.toString());
	}

}
