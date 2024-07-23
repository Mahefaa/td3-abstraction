package com.td3.shapes;

import static java.lang.Math.PI;

public class Circle extends Shape {
  private final double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double getSurface() {
    return PI * radius * radius;
  }
}
