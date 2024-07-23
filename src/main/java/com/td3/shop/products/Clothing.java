package com.td3.shop.products;

public class Clothing {
  private final String id;
  private final String name;
  private final String description;
  private final double unitPrice;
  private final ClotheSize size;
  private final ClothingMaterial material;

  public Clothing(
      String id,
      String name,
      String description,
      double unitPrice,
      ClotheSize size,
      ClothingMaterial material) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.unitPrice = unitPrice;
    this.size = size;
    this.material = material;
  }

  public enum ClotheSize {
    M,
    L,
    XL,
    XXL;
  }

  public enum ClothingMaterial {
    COTTON,
    WOOl,
    SILK;
  }

  public final double prixTTCAvecLivraison() {
    return unitPrice + getSizeDependantAddedPrice() + getMaterialDependantAddedPrice();
  }

  private double getMaterialDependantAddedPrice() {
    return switch (material) {
      case COTTON -> unitPrice * 10 / 100;
      case SILK, WOOl -> 0;
    };
  }

  private double getSizeDependantAddedPrice() {
    return switch (size) {
      case M -> 0;
      case L, XL, XXL -> unitPrice * 5 / 100;
    };
  }
}
