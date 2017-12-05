public class Food {
	private int expirationDate;
	private ArrayStack bun;
	private ArrayStack cheese;
	private ArrayStack patty;
	private ArrayStack lettuce;
	private ArrayStack tomato;
	private ArrayStack onion;
	
	Food() {
		
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
