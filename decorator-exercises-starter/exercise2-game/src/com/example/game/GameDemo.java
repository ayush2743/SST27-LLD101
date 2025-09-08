package com.example.game;

/**
 * Starter demo using only the base character.
 * TODOs guide you to implement decorators and compose them.
 */
public class GameDemo {
  public static void main(String[] args) {
    Character base = new BaseCharacter();

    System.out.println("--- Base ---");
    base.move();
    base.attack();

    // 1) Base + SpeedBoost + DamageBoost
    Character buffed = new DamageBoost(new SpeedBoost(base, 3), 15);
    System.out
        .println("Speed: " + buffed.getSpeed() + ", Damage: " + buffed.getDamage() + ", Sprite: " + buffed.getSprite());
    buffed.move();
    buffed.attack();

    // 2) Add GoldenAura (sprite change + buffs)
    Character shiny = new GoldenAura(buffed);
    System.out
        .println("Speed: " + shiny.getSpeed() + ", Damage: " + shiny.getDamage() + ", Sprite: " + shiny.getSprite());
    shiny.move();
    shiny.attack();

    // 3) Remove GoldenAura by recomposition (rebuild chain without it)
    Character withoutAura = buffed; // reference to the original buffed character without aura
    System.out.println("Speed: " + withoutAura.getSpeed() + ", Damage: " + withoutAura.getDamage() + ", Sprite: "
        + withoutAura.getSprite());
    withoutAura.move();
    withoutAura.attack();

    // 4) Different composition order demonstration
    Character alternateOrder = new SpeedBoost(new GoldenAura(new DamageBoost(base, 20)), 5);
    System.out.println("Speed: " + alternateOrder.getSpeed() + ", Damage: " + alternateOrder.getDamage() + ", Sprite: "
        + alternateOrder.getSprite());
    alternateOrder.move();
    alternateOrder.attack();
  }
}
