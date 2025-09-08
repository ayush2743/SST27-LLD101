package com.example.beverages_decorator;

import com.example.beverages_decorator.DecoratorFactory.DecoratorType;

public class Client {

	public static void main(String[] args) {
		
		Beverage coffee1 = new Cappuccino();
		coffee1 = DecoratorFactory.addDecorator(coffee1, DecoratorType.CHOCOLATE);
		System.out.println("Cappuccino with Chocolate: " + coffee1.cost());
		
		Beverage coffee2 = new Latte();
		coffee2 = DecoratorFactory.addMultipleDecorators(coffee2, DecoratorType.MILK, DecoratorType.SUGAR);
		System.out.println("Latte with Milk and Sugar: " + coffee2.cost());
		
	}
}