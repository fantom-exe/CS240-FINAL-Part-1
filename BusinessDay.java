import java.util.Random;

/**
 * Day-to-day business operations
 */
public class BusinessDay {
	// system variables
	private Random rand;
	
	// business variables
	private Inventory inventory;
	private Customer customer;
	private ArrayQueue line;
	private int lostCustomerDay;
	private int customersArrived;
	
	// new day
	BusinessDay() {
		rand = new Random(System.currentTimeMillis());
		
		inventory = new Inventory();
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
		// customers order one by one
		while(!line.isEmpty()) {
			// order failed
			if(!inventory.order(1 + rand.nextInt(5)))
				lostCustomerDay++;
			
			// shorten line
			line.dequeue();
		}
		
	}
	
	// shipment arrives
	public void shipmentArrived() {
		// Shipment arrive 9:00AM every 3-6 days
		// Randomly add 700-1000 total items
		int numOfItems = 700 + rand.nextInt(300);
		
		while (numOfItems > 0) {
			inventory.addItem(1 + rand.nextInt(6));
			
			numOfItems--;
		}
	}
	
	// possible shipment date
	public int nextShipmentDate(int todaysDate) {
		return todaysDate + rand.nextInt(3) + 3;
	}
	
	// closing operations
	public void closing() {
		// Sort food items by expiration day. (pick any sort)
		//Place items about to expire on top of stack. If item expires remove item. Increment lost item.
		
		
		//Example if I throw away a tomato I will increment wasteTomtato
		
	}
	
	// prints daily data
	public void output(int day) {
		// the day, customers lost, wasted items, items ordered
		System.out.println("Day: December " + (day - 1200) + " | Customers lost: " + lostCustomerDay);
		System.out.println("Wasted food -> "
				+ " | Wasted cheese: " + inventory.getWasteCheese()
				+ " | Wasted buns: " + inventory.getWasteBun()
				+ " | Wasted patties: " + inventory.getWastePatty()
				+ " | Wasted lettuce: " + inventory.getWasteLettuce()
				+ " | Wasted tomatoes: " + inventory.getWasteTomato()
				+ " | Wasted onions: " + inventory.getWasteOnion());
		System.out.println("Items ordered -> "
				+ " | Ordered itemOne: " + inventory.getCountItemOne()
				+ " | Ordered itemTwo: " + inventory.getCountItemTwo()
				+ " | Ordered itemThree: " + inventory.getCountItemThree()
				+ " | Ordered itemFour: " + inventory.getCountItemFour()
				+ " | Ordered itemFive: " + inventory.getCountItemFive()
				+ " | Ordered itemSix: " + inventory.getCountItemSix());
		
		System.out.println();
		// then the dict and everything on a new line
	}
	
}
