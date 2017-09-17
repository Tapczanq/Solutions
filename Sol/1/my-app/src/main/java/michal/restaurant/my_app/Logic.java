package michal.restaurant.my_app;

import java.util.ArrayList;
import java.util.Scanner;

public class Logic {
	Menu menu = new Menu();
	ArrayList<Drink> drinks;
	ArrayList<Dessert> desserts;
	ArrayList<MainCourse> mainCourses;
	
	public void greetings(){
	System.out.println("Welcome! ");};
	
	
	public String custommerChoice(){
		Scanner scanner = new Scanner(System.in);
		String choice=scanner.nextLine();
		return choice;};
		
	public void mealChoise(){
		while (true){
		System.out.println("You can choose a lunch or a drink. \nPlease select \"l\" if you want a lunch or \"d\" if you want a drink." );
		String choice=custommerChoice();
		
		if(choice.equals("d")){
			System.out.println("Please Enter the number of the drink you want: \n ");
			drinks=menu.createDrinksMenu();
			for(int i=0;i<drinks.size();i++){
			System.out.println(i+1 +"." +drinks.get(i).getName()+"-"+drinks.get(i).getPrice()+" EUR");}
			
			String drinkChoice=custommerChoice();
			int number = Integer.parseInt(drinkChoice);
			System.out.println("Thanks, you have chosen: " + drinkChoice +". "+ drinks.get(number-1).getName()+"\n");
			System.out.println("Do you want extra ice cubes or/and lemon? (y/n)");
			String extraToDrink=custommerChoice();
			if(extraToDrink.equals("y")){
				System.out.println("What do you want? type a letter \"i\" for ice,\"l\" for lemon or \"b\" for both" );
				String toDrink=custommerChoice();
				switch (toDrink) {
	            case "i":  System.out.println("You ordered " +drinks.get(number-1).getName()+ " with ice cubes\n");
	                     break;
	            case "l":  System.out.println("You ordered " +drinks.get(number-1).getName()+ " with  lemon\n");
	                     break;
	            case "b":  System.out.println("You ordered " +drinks.get(number-1).getName()+ " with ice cubes and lemon\n");
	                     break;
	          
	            default: System.out.println("You entered a wrong letter\n");
	                     break; }
	       }else{System.out.println("Thanks, you ordered " +drinks.get(number-1).getName()+"\n");}}
		if(choice.equals("l")){
			System.out.println("Lunch consists of the main course and dessert.\nPlease Enter the number of the Main Courses you want:\n");
			mainCourses=menu.createMainCourseMenu();
			for(int i=0;i<mainCourses.size();i++){
				System.out.println(i+1 +"." +mainCourses.get(i).getName()+"-"+mainCourses.get(i).getPrice()+" EUR " + mainCourses.get(i).getCuisines()+" cuisine");}
			String mainCourseChoice=custommerChoice();
			int number = Integer.parseInt(mainCourseChoice);
			System.out.println("Thanks, you have chosen:" + mainCourseChoice +"."+ mainCourses.get(number-1).getName()+"\n");
			System.out.println("Please Enter the number of the dessert you want:  ");
			
			desserts=menu.createDessertMenu();
			for(int i=0;i<desserts.size();i++){
				System.out.println(i+1 +"." +desserts.get(i).getName()+"-"+desserts.get(i).getPrice()+" EUR " + desserts.get(i).getCuisines()+" cuisine");} 
			String dessertChoice=custommerChoice();
			int number1 = Integer.parseInt(dessertChoice);
			System.out.println("Thanks, you have chosen:" + dessertChoice +"."+ desserts.get(number1-1).getName()+"\n");
		}
		}	
			
	
	}
}
