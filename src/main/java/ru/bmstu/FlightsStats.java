package ru.bmstu;

import java.io.Serializable;

public class FlightsStats implements Serializable {
    private int count, countCancelledFlights, countLateFlights;
    private float maxDelay;

    public FlightsStats (int count, int countCancelledFlights, int countLateFlights, float maxDelay) {
        this.count = count;
        this.countCancelledFlights = countLateFlights;
        this.countLateFlights = countLateFlights;
        this.maxDelay = maxDelay;
    }
}
