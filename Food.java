public class Food {
	private ArrayStack stack;
	private int expirationDate; // if 0, no expiration
	
	Food() {
		stack = new ArrayStack();
		expirationDate = 0;
	}
	
	public int getExpirationDate() {
		return expirationDate;
	}
	
	private void setExpirationDate(int date) {
		expirationDate = date;
	}
	
	private int getWastedFoodAmount(Food food) {
		
		return -1;
	}
	
	private void setWastedFood(Food food, int wastedAmount) {
	
	}
	
}
