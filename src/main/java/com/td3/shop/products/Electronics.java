package com.td3.shop.products;

public class Electronics extends Product {
  public static final int KG_PRICE = 15_000;
  private final String brand;
  private final double weightInKg;

  public Electronics(
      String id,
      String name,
      String description,
      double unitPrice,
      String brand,
      double weightInKg) {
    super(id, name, description, unitPrice);
    this.brand = brand;
    this.weightInKg = weightInKg;
  }

  public final double prixTTCAvecLivraison() {
    return unitPrice + (weightInKg * KG_PRICE);
  }
}
