package com.td3.booking;

import java.time.Duration;
import java.time.LocalDate;

public class ActivityBooking extends Booking {
  private final String activityName;
  private final int participantNumber;
  private final Duration activityDuration;

  public ActivityBooking(
      String id,
      String clientName,
      LocalDate bookingDate,
      String activityName,
      int participantNumber,
      Duration activityDuration) {
    super(id, clientName, bookingDate);
    this.activityName = activityName;
    this.participantNumber = participantNumber;
    this.activityDuration = activityDuration;
  }

  @Override
  public double calculateTotalCost() {
    return participantNumber * activityDuration.toMinutes();
  }

  public int sortir() {
    return 0;
  }
}
