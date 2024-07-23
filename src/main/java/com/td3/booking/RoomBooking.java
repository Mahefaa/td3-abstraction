package com.td3.booking;

import java.time.LocalDate;

public class RoomBooking extends Booking {
  private final String roomNumber;
  private final int nights;
  private final RoomType roomType;

  public RoomBooking(
      String id,
      String clientName,
      LocalDate bookingDate,
      String roomNumber,
      int nights,
      RoomType roomType) {
    super(id, clientName, bookingDate);
    this.roomNumber = roomNumber;
    this.nights = nights;
    this.roomType = roomType;
  }

  @Override
  public double calculateTotalCost() {
    return roomType.pricePerNight * nights;
  }

  public enum RoomType {
    SIMPLE(1),
    DOUBLE(2),
    VIP(1_000_000_000);

    public int getPricePerNight() {
      return pricePerNight;
    }

    private final int pricePerNight;

    RoomType(int pricePerNight) {
      this.pricePerNight = pricePerNight;
    }
  }

  public int coolDown() {
    return 0;
  }
}
