package com.example.video;

public class SharpenAdapter {
  private final LegacySharpen legacySharpen;

  public SharpenAdapter() {
    this.legacySharpen = new LegacySharpen();
  }

  public Frame[] sharpen(Frame[] frames, int strength) {

    String handle = "frames_" + frames.length;
    
    legacySharpen.applySharpen(handle, strength);
    
    return frames;
  }
}
