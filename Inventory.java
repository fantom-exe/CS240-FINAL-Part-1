/**
 * Food Inventory
 */
public class Inventory {
	// Food items
	private ArrayStack bun;
	private ArrayStack cheese;
	private ArrayStack patty;
	private ArrayStack lettuce;
	private ArrayStack tomato;
	private ArrayStack onion;
	
	// Menu items
	private ArrayList burger; // 1
	private ArrayList cheeseBurger; // 2
	private ArrayList veganLettuceWrapBurger; // 3
	private ArrayList burgerNoOnion; // 4
	private ArrayList cheeseBurgerNoOnion; // 5
	private ArrayList burgerNoTomato; // 6
	
	Inventory() {
		// burger
		burger.add(bun);
		burger.add(patty);
		burger.add(lettuce);
		burger.add(tomato);
		burger.add(onion);
		// cheese burger
		cheeseBurger.add(cheese);
		cheeseBurger.add(bun);
		cheeseBurger.add(patty);
		cheeseBurger.add(lettuce);
		cheeseBurger.add(tomato);
		cheeseBurger.add(onion);
		// vegan lettuce wrap burger
		veganLettuceWrapBurger.add(lettuce);
		veganLettuceWrapBurger.add(lettuce);
		veganLettuceWrapBurger.add(tomato);
		veganLettuceWrapBurger.add(onion);
		// buger no onion
		burgerNoOnion.add(bun);
		burgerNoOnion.add(patty);
		burgerNoOnion.add(lettuce);
		burgerNoOnion.add(tomato);
		// cheese burger no onion
		cheeseBurgerNoOnion.add(cheese);
		cheeseBurgerNoOnion.add(bun);
		cheeseBurgerNoOnion.add(patty);
		cheeseBurgerNoOnion.add(lettuce);
		cheeseBurgerNoOnion.add(tomato);
		// burger no tomato
		burgerNoTomato.add(bun);
		burgerNoTomato.add(patty);
		burgerNoTomato.add(lettuce);
		burgerNoTomato.add(onion);
	}
}
