/**
 * Food Inventory
 */
public class Inventory {
	// Food items
	private Food bun;
	private Food cheese;
	private Food patty;
	private Food lettuce;
	private Food tomato;
	private Food onion;
	
	// Menu items
	private ArrayList burger; // 1
	private ArrayList cheeseBurger; // 2
	private ArrayList veganLettuceWrapBurger; // 3
	private ArrayList burgerNoOnion; // 4
	private ArrayList cheeseBurgerNoOnion; // 5
	private ArrayList burgerNoTomato; // 6
	
	// Food inventory
	private ArrayStack bunInventory;
	private ArrayStack cheeseInventory;
	private ArrayStack pattyInventory;
	private ArrayStack lettuceInventory;
	private ArrayStack tomatoInventory;
	private ArrayStack onionInventory;
	
	// setup
	Inventory() {
		setupFoods();
		setupMenu();
		setupInventory();
	}
	
	/**
	 * Add new items to inventory
	 */
	public void addItem(int item) {
		switch (item) {
			case 1:
				bunInventory.push(bun);
				break;
			case 2:
				cheeseInventory.push(cheese);
				break;
			case 3:
				pattyInventory.push(patty);
				break;
			case 4:
				lettuceInventory.push(lettuce);
				break;
			case 5:
				tomatoInventory.push(tomato);
				break;
			case 6:
				onionInventory.push(onion);
				break;
		}
		
	}
	
	/**
	 * Order Menu Item
	 */
	public boolean order(int orderNum) {
		switch (orderNum) {
			case 1:
				bunInventory.pop();
				pattyInventory.pop();
				lettuceInventory.pop();
				tomatoInventory.pop();
				onionInventory.pop();
				break;
			case 2:
				cheeseInventory.push(cheese);
				break;
			case 3:
				pattyInventory.push(patty);
				break;
			case 4:
				lettuceInventory.push(lettuce);
				break;
			case 5:
				tomatoInventory.push(tomato);
				break;
			case 6:
				onionInventory.push(onion);
				break;
		}
	}
	
	/**
	 * Setup Foods
	 */
	private void setupFoods() {
		bun = new Food();
		bun.setExpirationDate(5);
		
		cheese = new Food();
		cheese.setExpirationDate(2);
		
		patty = new Food();
		patty.setExpirationDate(4);
		
		lettuce = new Food();
		lettuce.setExpirationDate(3);
		
		tomato = new Food();
		tomato.setExpirationDate(3);
		
		onion = new Food();
		onion.setExpirationDate(5);
	}
	
	/**
	 * Setup Menu
	 */
	private void setupMenu() {
		// burger
		burger = new ArrayList(); // 1
		burger.add(bun);
		burger.add(patty);
		burger.add(lettuce);
		burger.add(tomato);
		burger.add(onion);
		
		// cheese burger
		cheeseBurger = new ArrayList(); // 2
		cheeseBurger.add(cheese);
		cheeseBurger.add(bun);
		cheeseBurger.add(patty);
		cheeseBurger.add(lettuce);
		cheeseBurger.add(tomato);
		cheeseBurger.add(onion);
		
		// vegan lettuce wrap burger
		veganLettuceWrapBurger = new ArrayList(); // 3
		veganLettuceWrapBurger.add(lettuce);
		veganLettuceWrapBurger.add(lettuce);
		veganLettuceWrapBurger.add(tomato);
		veganLettuceWrapBurger.add(onion);
		
		// burger no onion
		burgerNoOnion = new ArrayList(); // 4
		burgerNoOnion.add(bun);
		burgerNoOnion.add(patty);
		burgerNoOnion.add(lettuce);
		burgerNoOnion.add(tomato);
		
		// cheese burger no onion
		cheeseBurgerNoOnion = new ArrayList(); // 5
		cheeseBurgerNoOnion.add(cheese);
		cheeseBurgerNoOnion.add(bun);
		cheeseBurgerNoOnion.add(patty);
		cheeseBurgerNoOnion.add(lettuce);
		cheeseBurgerNoOnion.add(tomato);
		
		// burger no tomato
		burgerNoTomato = new ArrayList(); // 6
		burgerNoTomato.add(bun);
		burgerNoTomato.add(patty);
		burgerNoTomato.add(lettuce);
		burgerNoTomato.add(onion);
	}
	
	/**
	 * Setup Empty Inventories
	 */
	private void setupInventory() {
		bunInventory = new ArrayStack();
		cheeseInventory = new ArrayStack();
		pattyInventory = new ArrayStack();
		lettuceInventory = new ArrayStack();
		tomatoInventory = new ArrayStack();
		onionInventory = new ArrayStack();
	}
	
}
