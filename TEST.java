import java.util.Random;

public class TEST {

	public static void main(String[] args) {
		BusinessDay day;
		
		int startingDate = 1201; // December 1 (format: mmdd)
		int endingDate = 1231; // December 31 (format: mmdd)
		int openingTime = 10; // 10 AM (format: 24 hr)
		int closingTime = 19; // 7 PM (format: 24 hr)
		
		// business days
		for(int date = startingDate; date <= endingDate; date++) {
			day = new BusinessDay(); // begin new day
			day.possibleShipment(); // check if shipments arrived (NOT daily, every 3-6 days)
			
			// business hours
			for(int time = openingTime; time <= closingTime; time++) {
				System.out.println(time);
				
				// customers attend
				day.generateCustomers();
				// customers order then leave
				day.placeOrders();
				
				// print
				day.output(date, time);
			}
			
			// end the day
			day.closing();
		}
		
	}
	
}
