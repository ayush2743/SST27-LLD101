package com.example.render;

public class Glyph {
  // Flyweight pattern: char is extrinsic, TextStyle is intrinsic (shared)
  private final char ch;
  private TextStyle textStyle;

  public Glyph(char ch, TextStyle textStyle) {
    this.ch = ch;
    this.textStyle = textStyle;
  }

  public char getCh() {
    return ch;
  }

  public int getCost() {
    return textStyle.drawCost();
  }
}
