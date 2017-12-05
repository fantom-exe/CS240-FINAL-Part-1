import java.util.Random;

/**
 * Day-to-day business operations
 */
public class BusinessDay {
	// member variables
	Random rand;
	
	// business variables
	private int hoursOfOperation;
	private Customer customer;
	private ArrayQueue line;
	private int lostCustomerDay;
	
	// new day
	BusinessDay() {
		rand = new Random();
		
		hoursOfOperation = 10;
		customer = new Customer();
		line = new ArrayQueue();
		lostCustomerDay = 0;
	}
	
	private void generateCustomer() {
		// if queue full, intCustomers++
		
	}
	
	private void placeOrder() {
		// if order successful, itemOrdered++
		// if items ordered not available, lostCustomerDay++
	}
	
	private void shipment() {
		// Shipment arrive 9:00AM every 3-6 days
		// Randomly add 700-1000 total items
	}
	
	private void endDay() {
		// Sort food items by expiration day. (pick any sort)
		//Place items about to expire on top of stack. If item expires remove item. Increment lost item.
		//Example if I throw away a tomato I will increment wasteTomtato
	}
	
}
