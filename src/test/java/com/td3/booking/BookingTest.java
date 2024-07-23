package com.td3.booking;

import static com.td3.booking.RoomBooking.RoomType.VIP;
import static java.time.Month.JULY;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class BookingTest {
  @Test
  void representer_liste_de_booking() {
    Booking r1 = new RoomBooking("id_1", "mahefa", LocalDate.of(2024, JULY, 23), "A1", 40, VIP);
    Booking a2 =
        new ActivityBooking(
            "id_1", "mahefa", LocalDate.of(2024, JULY, 23), "A1", 40, Duration.ofDays(40));

    List<Booking> bookings = new ArrayList<>();
    bookings.add(r1);
    bookings.add(a2);

    bookings.forEach(
        (p) -> {
          if (p instanceof ActivityBooking asActivityBooking) {
            asActivityBooking.sortir();
          }
          if (p instanceof RoomBooking asRoomBooking) {
            asRoomBooking.coolDown();
          }
        });
  }
}
