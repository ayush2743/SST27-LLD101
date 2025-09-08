package com.example.game;

/**
 * Decorator that adds a damage boost to a character.
 * Overrides getDamage() to add the boost and attack() to show enhanced
 * behavior.
 */
public class DamageBoost extends CharacterDecorator {
  private int damageBonus;

  public DamageBoost(Character character, int damageBonus) {
    super(character);
    this.damageBonus = damageBonus;
  }

  @Override
  public int getDamage() {
    return wrappedCharacter.getDamage() + damageBonus;
  }

  @Override
  public void attack() {
    System.out.println("Attacking with DAMAGE BOOST dealing " + getDamage() + " damage using sprite " + getSprite());
  }
}
