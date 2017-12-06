import java.util.Random;

public class TEST {

	// TEST
	public static void main(String[] args) {
		Random rand = new Random(System.currentTimeMillis());
		BusinessDay day;
		
		int startingDate = 1201; // December 1 (format: mmdd)
		int endingDate = 1231; // December 31 (format: mmdd)
		int openingTime = 10; // 10 AM (format: 24 hr)
		int closingTime = 19; // 7 PM (format: 24 hr)
		
		int index = 1;
		// business days
		for(int date = startingDate; date <= endingDate; date++) {
			day = new BusinessDay(); // begin new day
			
			index--; // check if shipments arrived (NOT daily, every 3-6 days)
			if(date == day.nextShipmentDate(date) && index < rand.nextInt(3)) {
				day.shipmentArrived();
				index += rand.nextInt(6);
			}
			
			// business hours
			for(int time = openingTime; time <= closingTime; time++) {
				// customers attend
				day.generateCustomers();
				// customers order then leave
				day.placeOrders();
			}
			
			// print
			day.output(date);
			
			// end the day
			day.closing();
		}
		
	}
	
}
