package ru.bmstu;

public class Flight {
    private int originAirportID, destAirportId;
    private float delay, isCancelled;

    public Flight (int originAirportID, int destAirportId, float delay, float isCanceled) {
        this.originAirportID = originAirportID;
        this.destAirportId = destAirportId;
        this.delay = delay;
        this.isCanceled = isCanceled;
    }

    public int getOriginAirportID() {
        return originAirportID;
    }

    public void setOriginAirportID(int originAirportID) {
        this.originAirportID = originAirportID;
    }

    public int getDestAirportId() {
        return destAirportId;
    }

    public void setDestAirportId(int destAirportId) {
        this.destAirportId = destAirportId;
    }

    public float getDelay() {
        return delay;
    }

    public void setDelay(float delay) {
        this.delay = delay;
    }

    public float getIsCanceled() {
        return isCanceled;
    }

    public void setIsCanceled(float isCanceled) {
        this.isCanceled = isCanceled;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "delayTime='" + delay + '\'' +
                ", cancelled=" + isCancelled +
                ", destAirportId=" + destAirportID +
                ", originAirportId=" + originAirportID +
                '}';
    }
}
