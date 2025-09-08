package com.example.game;

/**
 * Decorator that adds a golden aura effect to a character.
 * Changes sprite, provides small buffs to both speed and damage, and logs aura
 * effects.
 */
public class GoldenAura extends CharacterDecorator {
  private static final int SPEED_BUFF = 2;
  private static final int DAMAGE_BUFF = 5;
  private static final String GOLDEN_SPRITE = "golden_aura.png";

  public GoldenAura(Character character) {
    super(character);
  }

  @Override
  public int getSpeed() {
    return wrappedCharacter.getSpeed() + SPEED_BUFF;
  }

  @Override
  public int getDamage() {
    return wrappedCharacter.getDamage() + DAMAGE_BUFF;
  }

  @Override
  public String getSprite() {
    return GOLDEN_SPRITE;
  }

  @Override
  public void move() {
    System.out.println("Move");
    System.out.println("Moving with GOLDEN AURA at speed " + getSpeed() + " with sprite " + getSprite());
  }

  @Override
  public void attack() {
    System.out.println("Attack");
    System.out.println("Attacking with GOLDEN AURA dealing " + getDamage() + " damage using sprite " + getSprite());
  }
}
