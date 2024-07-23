package com.td3.products.shapes;

import static com.td3.products.Clothing.ClotheSize.M;
import static com.td3.products.Clothing.ClotheSize.XL;
import static com.td3.products.Clothing.ClothingMaterial.COTTON;
import static com.td3.products.Clothing.ClothingMaterial.WOOl;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.td3.products.Clothing;
import com.td3.products.Electronics;
import org.junit.jupiter.api.Test;

class ClothingTest {
  @Test
  void get_right_price_ok() {
    Clothing cottonClothing = new Clothing("id_1", "foulard", "beau foulard coloré en cotton", 100_000, XL, COTTON);
    Clothing woolClothing = new Clothing("id_2", "foulard", "beau foulard coloré en laine", 100_000, M, WOOl);

    assertEquals(115_000, cottonClothing.prixTTCAvecLivraison());
    assertEquals(100_000, woolClothing.prixTTCAvecLivraison());
  }
}
