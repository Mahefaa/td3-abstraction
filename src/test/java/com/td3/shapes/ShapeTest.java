package com.td3.shapes;

import static java.lang.Math.PI;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ShapeTest {
  @Test
  void get_square_surface_ok() {
    Square square = new Square(10);

    assertEquals(100, square.getSurface());
  }

  @Test
  void get_circle_surface_ok() {
    Circle circle = new Circle(1);

    assertEquals(PI, circle.getSurface());
  }

  @Test
  void get_triangle_surface_ok() {
    Triangle triangle = new Triangle(2, 2);

    assertEquals(2, triangle.getSurface());
  }
}
