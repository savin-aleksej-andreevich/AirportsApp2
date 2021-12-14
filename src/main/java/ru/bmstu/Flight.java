package ru.bmstu;

public class Flight {
    private int originAirportID, destAirportID;
    private float delay, isCancelled;

    public Flight(int originAirportID, int destAirportId, float delay, float isCanceled) {
        this.originAirportID = originAirportID;
        this.destAirportID = destAirportId;
        this.delay = delay;
        this.isCancelled = isCanceled;
    }

    public int getOriginAirportID() {
        return originAirportID;
    }

    public void setOriginAirportID(int originAirportID) {
        this.originAirportID = originAirportID;
    }

    public int getDestAirportId() {
        return destAirportID;
    }

    public void setDestAirportId(int destAirportId) {
        this.destAirportID = destAirportId;
    }

    public float getDelay() {
        return delay;
    }

    public void setDelay(float delay) {
        this.delay = delay;
    }

    public float getIsCanceled() {
        return isCancelled;
    }

    public void setIsCanceled(float isCanceled) {
        this.isCancelled = isCanceled;
    }

    @Override
    public String toString() {
        return "ru.bmstu.Flight{" +
                "delayTime='" + delay + '\'' +
                ", cancelled=" + isCancelled +
                ", destAirportId=" + destAirportID +
                ", originAirportId=" + originAirportID +
                '}';
    }
}
