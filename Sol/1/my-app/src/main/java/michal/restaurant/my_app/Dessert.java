package michal.restaurant.my_app;

public class Dessert extends Meal {
	private String cuisines;

	public Dessert(String name, int price, String cuisines) {
		super(name, price);
		this.cuisines = cuisines;
	}

	public String getCuisines() {
		return cuisines;
	}
}
