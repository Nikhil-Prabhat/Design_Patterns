package BuilderFactory;

public class BuilderPatternDemo {
	
	public static void main(String[] args)
	{
	MealBuilder mealBuilder = new MealBuilder();
	
	Meal vegMeal = mealBuilder.prepareVegMeal();
	System.out.println("***********Veg Meal***********\n");
	vegMeal.showItems();
	System.out.println("Total Cost : " + vegMeal.getCost());
	
	System.out.println();
	System.out.println("***********Non Veg Meal***********\n");
	Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
	nonVegMeal.showItems();
	System.out.println("Total Cost : " + nonVegMeal.getCost());
	
	}

	
}
