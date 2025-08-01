package com.example.internevaluate;

import com.example.internevaluate.model.Flight;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class InternEvaluateApplication {

    public static void main(String[] args) {
        File file = new File("flights.json");
        // 1. Print all flights in flight in template
        // Data must like below
        //Flight Number: VI838
        //Airline: Vietnam Airlines
        //From HUI to HAN
        //Departure: 2025-08-01T14:00:00
        //Arrival: 2025-08-01T16:30:00
        //Duration: 150 minutes
        //Price: $84.29
        //Status: Scheduled

        //2. Order by Price, Arrival

        //3. List only filght from or to HAN

        //4. Adđ flight to json from HAN to CXR, flight time, duration must be valid.
        // flight arrive and depart must be differnt more than 5 minutes from other in same location

        //4. Print all posible routes, price, and which direct or transit from SGN to CXR
        //Transit will only work if arrival and deprtute more than 30 minutes.


    }

}
