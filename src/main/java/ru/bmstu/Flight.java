package ru.bmstu;

public class Flight {
    private int originAirportID, destAirportId;
    private float delay, isCanceled;

    public Flight (int originAirportID, int destAirportId, float delay, float isCanceled) {
        this.originAirportID = originAirportID;
        this.destAirportId = destAirportId;
        this.delay = delay;
        this.isCanceled = isCanceled;
    }
}
