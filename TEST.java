import java.util.Random;

public class TEST {

	public static void main(String[] args) {
		int startingDate = 1201; // December 1 (format: mmdd)
		int endingDate = 1231; // December 31 (format: mmdd)
		int openingTime = 10; // 10 AM (format: 24 hr)
		int closingTime = 19; // 7 PM (format: 24 hr)
		BusinessDay day;
		
		for(int date = startingDate; date <= endingDate; date++) { // days
			day = new BusinessDay();
			
			for(int time = openingTime; time <= closingTime; time++) { // hours
				System.out.println(time);
				
				
				
			}
			
		}
		
	}
	
}
