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

    public static FlightStats createFlightsStats (Flight flight) {
        return new FlightStats(1, flight.getIsCanceled() > 0.f ? 1 : 0, flight.getDelay() > 0.f ? 1 : 0, flight.getDelay());
    }

    public static FlightStats addFlight (FlightStats stats, Flight flight) {
        int count = stats.getCount() + 1;
        int countCancelledFlights = flight.getIsCanceled() == 0.f? stats.getCountCancelledFlights() + 1 : stats.getCountCancelledFlights();
        int countLateFlights = flight.getDelay() == 0.f? stats.getCountLateFlights() + 1 : stats.getCountLateFlights();
        float maxLateTime = Math.max(stats.getMaxLateTime(), flight.getDelay());
        return new FlightStats(count, countCancelledFlights, countLateFlights, maxLateTime);
    }

    public static FlightStats combineFlightStats (FlightStats stats1, FlightStats stats2) {
        int combineCount = stats1.getCount() + stats2.getCount();
        int countCancelledFlights = stats1.getCountCancelledFlights() + stats2.getCountCancelledFlights();
        int countLateFlights = stats1.getCountLateFlights() + stats2.getCountLateFlights();
        float maxLateTime = Math.max(stats1.getMaxLateTime(), stats2.getMaxLateTime());
        return new FlightStats(combineCount, countCancelledFlights, countLateFlights, maxLateTime);
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
