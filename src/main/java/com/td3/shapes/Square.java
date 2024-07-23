package com.td3.shapes;

public class Square extends Shape {
  private final int width;

  public Square(int width) {
    this.width = width;
  }

  @Override
  public double getSurface() {
    return width * width;
  }
}
