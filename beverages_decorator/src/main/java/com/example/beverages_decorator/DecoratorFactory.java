package com.example.beverages_decorator;

public class DecoratorFactory {

  public enum DecoratorType {
    CHOCOLATE,
    MILK,
    SUGAR,
  }

  public static Beverage addDecorator(Beverage beverage, DecoratorType type) {
    switch (type) {
      case CHOCOLATE:
        return new ChocolateDecorator(beverage);
      case MILK:
        return new MilkDecorator(beverage);
      case SUGAR:
        return new SugarDecorator(beverage);
      default:
        throw new IllegalArgumentException("Unknown decorator type: " + type);
    }
  }

  public static Beverage addMultipleDecorators(Beverage beverage, DecoratorType... types) {
    Beverage decoratedBeverage = beverage;
    for (DecoratorType type : types) {
      decoratedBeverage = addDecorator(decoratedBeverage, type);
    }
    return decoratedBeverage;
  }
}
