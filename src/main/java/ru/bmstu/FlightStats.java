package ru.bmstu;

import java.io.Serializable;

public class FlightStats implements Serializable {
    private int count, countCancelledFlights, countLateFlights;
    private float maxLateTime;

    public FlightStats(int count, int countCancelledFlights, int countLateFlights, float maxLateTime) {
        this.count = count;
        this.countCancelledFlights = countLateFlights;
        this.countLateFlights = countLateFlights;
        this.maxLateTime = maxLateTime;
    }

    public static FlightStats createFlightsStats (Flight flights) {

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

    public float getMaxLateTime() {
        return maxLateTime;
    }

    public void setMaxLateTime(float maxLateTime) {
        this.maxLateTime = maxLateTime;
    }

    @Override
    public String toString() {
        return  "maxLateTime=" + maxLateTime +
                ", latePercent=" + ((float)countLateFlights/count * 100) +
                ", cancelledPercent=" + ((float)countCancelledFlights/count * 100);
    }

}
