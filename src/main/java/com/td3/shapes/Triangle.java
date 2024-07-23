package com.td3.shapes;

public class Triangle extends Shape {
  private final int base;
  private final int height;

  public Triangle(int base, int height) {
    this.base = base;
    this.height = height;
  }

  @Override
  public double getSurface() {
    return base * height * 0.5;
  }
}
