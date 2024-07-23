package com.td3.products.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.td3.products.Electronics;
import org.junit.jupiter.api.Test;

class ElectronicsTest {
  @Test
  void get_right_price_ok() {
    Electronics electronics =
        new Electronics("id_1", "télé", "télé 4K UHD incurvé", 100_000, "SAMSUNG", 3);

    assertEquals(145_000, electronics.prixTTCAvecLivraison());
  }
}
