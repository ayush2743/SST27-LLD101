package com.example.render;

import java.util.*;

public class TextStyleFactory {

  private static Map<String,  TextStyle> map = new HashMap<>();

  public static TextStyle getTextStyle(String font, int size, boolean bold) {

    String key = font + "|" + size + "|" + bold;

    if(!map.containsKey(key)) {
      map.put(key, new TextStyle(font, size, bold));
    }

    return map.get(key);
  }
}