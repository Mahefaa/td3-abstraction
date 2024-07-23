package com.td3.booking;

import java.time.LocalDate;

public abstract class Booking {
  private final String id;
  private final String clientName;
  private final LocalDate bookingDate;

  protected Booking(String id, String clientName, LocalDate bookingDate) {
    this.id = id;
    this.clientName = clientName;
    this.bookingDate = bookingDate;
  }

  public abstract double calculateTotalCost();
}
