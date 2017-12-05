import java.util.Random;

/**
 * Day-to-day business operations
 */
public class BusinessDay {
	// system variables
	private Random rand;
	
	// business variables
//	private int hoursOfOperation;
	private Customer customer;
	private ArrayQueue line;
	private int lostCustomerDay;
	private int customersArrived;
	
	// new day
	BusinessDay() {
		rand = new Random(System.currentTimeMillis());
		
//		hoursOfOperation = 9;
		customer = new Customer();
		line = new ArrayQueue();
		lostCustomerDay = 0;
		customersArrived = 0;
	}
	
	// line of customers
	public void generateCustomers() {
		customersArrived = 1 + rand.nextInt(100);
		
		// check if more than 50 customers arrived
		if(customersArrived > 50) {
			lostCustomerDay += customersArrived - 50;
			
			customersArrived = 50;
		}
		
		// add customers to queue
		while (customersArrived > 0) {
			line.enqueue(customer);
			customersArrived--;
		}
		
	}
	
	// orders placed
	public void placeOrders() {
		// if order successful, itemOrdered++
		
		// if items ordered not available, lostCustomerDay++
	}
	
	// possible shipment arrives
	public void possibleShipment() {
		// Shipment arrive 9:00AM every 3-6 days
		// Randomly add 700-1000 total items
	}
	
	// closing operations
	public void closing() {
		// Sort food items by expiration day. (pick any sort)
		//Place items about to expire on top of stack. If item expires remove item. Increment lost item.
		//Example if I throw away a tomato I will increment wasteTomtato
		// call output()
	}
	
	// prints daily data
	private void output() {
		// the day, customers lost, wasted items, items ordered
		System.out.println();
		
		// then the dict and everything on a new line
	}
	
}
