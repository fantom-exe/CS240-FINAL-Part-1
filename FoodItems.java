public class FoodItems {
	private int expirationDate;
	private ArrayStack bun;
	private ArrayStack cheese;
	private ArrayStack patty;
	private ArrayStack lettuce;
	private ArrayStack tomato;
	private ArrayStack onion;
	
	FoodItems() {
	
	}
	
	public int getExpirationDate() {
		return expirationDate;
	}
	
	private void setExpirationDate(int date) {
		expirationDate = date;
	}
	
	private int getWastedFoodAmount(FoodItems foodItems) {
		
		return -1;
	}
	
	private void setWastedFood(FoodItems foodItems, int wastedAmount) {
	
	}
	
}
