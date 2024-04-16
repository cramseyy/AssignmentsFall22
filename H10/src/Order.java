import java.util.Date;
public class Order {
	//class data field
	public static final int ON_ORDER = 0;
	public static final int CANCELED = 1;
	public static final int SHIPPED = 2;
	private static int totalOrder = 0;
	private String orderName;
	private Date date;
	private int status;
	private String shippingAddress;
	private String phoneNumber;
	private String billingAddress;
	//sequence of methods to display information
	public Order(String name){
		  this.orderName = name;
          this.totalOrder += 1;
          this.status = ON_ORDER;
          this.date = new Date();
	}
	
	public void cancel() {
		  this.status = CANCELED;
          this.date = new Date();
	}
	
	public void ship() {
	    this.status = SHIPPED;
        this.date = new Date();
	}
	
	public Date getDate() {
		return date;
	}
	
	public void setShippingAddress(String a) {
		shippingAddress = a;
	}
	
	public void setPhoneNumber(String p) {
		phoneNumber = p;
	}
	
	public void setBillingAddress(String add) {
		billingAddress = add;
	}
	
	public int getTotalOrder() {
		return totalOrder;
	}
	
	public String getOrderName() {
		return orderName;
	}
	
	public int getStatus() {
		return status;
	}
	
	public String getShippingAddress() {
		return shippingAddress;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getBillingAddress() {
		return billingAddress;
	}
	//string method to print out information
	public String toString() {
		   return this.orderName + " " + this.date + " " + this.status + " " + this.shippingAddress + " " + this.billingAddress + " " + this.phoneNumber;
	}
		
	

}
