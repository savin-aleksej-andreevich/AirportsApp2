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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCountCancelledFlights() {
        return countCancelledFlights;
    }

    public void setCountCancelledFlights(int countCancelledFlights) {
        this.countCancelledFlights = countCancelledFlights;
    }

    public int getCountLateFlights() {
        return countLateFlights;
    }

    public void setCountLateFlights(int countLateFlights) {
        this.countLateFlights = countLateFlights;
    }

    public float getMaxDelay() {
        return maxDelay;
    }

    public void setMaxDelay(float maxDelay) {
        this.maxDelay = maxDelay;
    }
}
