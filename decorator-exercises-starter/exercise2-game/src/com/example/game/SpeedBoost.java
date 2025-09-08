package com.example.game;

/**
 * Decorator that adds a speed boost to a character.
 * Overrides getSpeed() to add the boost and move() to show enhanced behavior.
 */
public class SpeedBoost extends CharacterDecorator {
  private int speedBonus;

  public SpeedBoost(Character character, int speedBonus) {
    super(character);
    this.speedBonus = speedBonus;
  }

  @Override
  public int getSpeed() {
    return wrappedCharacter.getSpeed() + speedBonus;
  }

  @Override
  public void move() {
    System.out.println("Moving with SPEED BOOST at speed " + getSpeed() + " with sprite " + getSprite());
  }
}
