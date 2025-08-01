package com.example.internevaluate.model;

import lombok.*;

@Data
public class Flight {
    private String flightNumber;
    private String airline;
    private String departure;
    private String arrival;
    private String departureTime;
    private String arrivalTime;
    private int durationMinutes;
    private double priceUSD;
    private String status;
}
