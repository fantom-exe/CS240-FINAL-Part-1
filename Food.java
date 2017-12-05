/**
 * Restaurant Food
 */
public class Food {
	private ArrayStack stack;
	private int expirationDate; // default 0 -> no expiration specified
	
	Food() {
		stack = new ArrayStack();
		expirationDate = 0;
	}
	
	public int checkExpirationDate() {
		return expirationDate;
	}
	
	public void setExpirationDate(int date) {
		expirationDate = date;
	}
	
	public int getWastedFoodAmount(Food food) {
		
		return -1;
	}
	
	public void setWastedFood(Food food, int wastedAmount) {
	
	}
	
}
