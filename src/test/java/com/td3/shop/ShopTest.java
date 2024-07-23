package com.td3.shop;

import static com.td3.shop.products.Clothing.ClotheSize.XL;
import static com.td3.shop.products.Clothing.ClothingMaterial.COTTON;

import com.td3.shop.products.Clothing;
import com.td3.shop.products.Electronics;
import com.td3.shop.products.Product;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class ShopTest {
  private final Shop subject = new Shop(new ArrayList<>());

  @Test
  void add_products_ok() {
    Product cottonClothing1 =
        new Clothing("id_1", "foulard", "beau foulard coloré en cotton", 100_000, XL, COTTON);
    Product electronics =
        new Electronics("id_1", "télé", "télé 4K UHD incurvé", 100_000, "SAMSUNG", 3);

    subject.addProduct(cottonClothing1);
    subject.addProduct(electronics);

    subject
        .getProducts()
        .forEach(
            p -> {
              System.out.println(p.getClass());
              if (p instanceof Clothing asClothing) {
                asClothing.mivarotena();
              }
              if (p instanceof Electronics asElectronics) {
                asElectronics.mandefaPubs();
              }
            });
  }
}
