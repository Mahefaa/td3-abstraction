package com.td3.products;

public class Electronics {
  public static final int KG_PRICE = 15_000;
  private final String id;
  private final String name;
  private final String description;
  private final double unitPrice;
  private final String brand;
  private final double weightInKg;

  public Electronics(
      String id,
      String name,
      String description,
      double unitPrice,
      String brand,
      double weightInKg) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.unitPrice = unitPrice;
    this.brand = brand;
    this.weightInKg = weightInKg;
  }

  public final double prixTTCAvecLivraison() {
    return unitPrice + (weightInKg * KG_PRICE);
  }
}
