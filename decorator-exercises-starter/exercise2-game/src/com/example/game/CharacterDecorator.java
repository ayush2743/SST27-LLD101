package com.example.game;

/**
 * Abstract decorator base class that implements Character interface
 * and wraps another Character object to add behavior.
 */
public abstract class CharacterDecorator implements Character {
  protected Character wrappedCharacter;

  public CharacterDecorator(Character character) {
    this.wrappedCharacter = character;
  }

  @Override
  public void move() {
    wrappedCharacter.move();
  }

  @Override
  public void attack() {
    wrappedCharacter.attack();
  }

  @Override
  public int getSpeed() {
    return wrappedCharacter.getSpeed();
  }

  @Override
  public int getDamage() {
    return wrappedCharacter.getDamage();
  }

  @Override
  public String getSprite() {
    return wrappedCharacter.getSprite();
  }
}
