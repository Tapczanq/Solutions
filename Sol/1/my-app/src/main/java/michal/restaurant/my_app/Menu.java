package michal.restaurant.my_app;

import java.util.ArrayList;

public class Menu {
	ArrayList<Drink> drinks;
	ArrayList<Dessert> desserts;
	ArrayList<MainCourse> mainCourses;
	Drink water= new Drink("Water", 3);
	Drink pepsi= new Drink("Pepsi",4);
	Drink mojito= new Drink("Mojito",4);
	
	Dessert applePie=new Dessert("Apple Pie",5,"Polish");
	Dessert brioche= new Dessert("Brioche", 7,"Polish");
	Dessert pudding = new Dessert("Pudding", 5,"Mexican");
	Dessert sherbet= new Dessert("Sherbet", 8,"Mexican");
	Dessert jam= new Dessert("Jam", 9,"Italian");
	Dessert cheesecake= new Dessert("Cheesecake", 6,"Italian");
	
	MainCourse rashers= new MainCourse("Rashers",7,"Polish");
	MainCourse roastedChicken= new MainCourse ("Roasted Chicken",14,"Polish");
	MainCourse schnitzel = new MainCourse ("Schnitzel",22,"Mexican");
	MainCourse steak= new MainCourse ("Steak",8,"Mexican");
	MainCourse pasta= new MainCourse ("Pasta",13,"Italian");
	MainCourse shishKebab= new MainCourse ("Shish Kebab",15,"Italian");
	
	public ArrayList createDrinksMenu(){
		drinks=new ArrayList<Drink>();
		drinks.add(water);
		drinks.add(pepsi);
		drinks.add(mojito);
		return drinks;
		}

	public ArrayList createDessertMenu(){
		desserts=new ArrayList<Dessert>();
		desserts.add(applePie);
		desserts.add(brioche);
		desserts.add(pudding);
		desserts.add(sherbet);
		desserts.add(jam);
		desserts.add(cheesecake);
		return desserts;
		}
	
	public ArrayList createMainCourseMenu(){
		mainCourses=new ArrayList<MainCourse>();
		mainCourses.add(rashers);
		mainCourses.add(roastedChicken);
		mainCourses.add(schnitzel);
		mainCourses.add(steak);
		mainCourses.add(pasta);
		mainCourses.add(shishKebab);
		return mainCourses;
		}
	
}
