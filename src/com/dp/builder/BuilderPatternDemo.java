package com.dp.builder;

public class BuilderPatternDemo {
	public static void main(String[] args) {
		MealBuilder builder = new MealBuilder();

		Meal meal = builder.prepareVegMeal();
		System.out.println("Veg Meal");
		meal.showItems();
		System.out.println("Total Cost: " + meal.getCost());
		
		meal = builder.prepareChickenMeal();
		System.out.println("Chicken Meal");
		meal.showItems();
		System.out.println("Total Cost: " + meal.getCost());
	}
}
