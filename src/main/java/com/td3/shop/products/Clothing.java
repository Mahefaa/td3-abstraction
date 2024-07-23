package com.td3.shop.products;

public class Clothing extends Product {
  private final ClotheSize size;
  private final ClothingMaterial material;

  public Clothing(
      String id,
      String name,
      String description,
      double unitPrice,
      ClotheSize size,
      ClothingMaterial material) {
    super(id, name, description, unitPrice);
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
