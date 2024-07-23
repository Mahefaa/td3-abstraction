package com.td3.shop;

import com.td3.shop.products.Product;
import java.util.List;

public class Shop {
  private final List<Product> products;

  public Shop(List<Product> products) {
    this.products = products;
  }

  public void addProduct(Product e) {
    products.add(e);
  }

  public void displayProduct() {
    products.forEach(System.out::println);
  }
}
