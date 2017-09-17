package michal.restaurant.my_app;

public class MainCourse extends Meal{
	private String cuisines;

	public MainCourse(String name, int price, String cuisines) {
		super(name, price);
		this.cuisines = cuisines;
	}

	public String getCuisines() {
		return cuisines;
	}

}
