package ru.bmstu;

import scala.Tuple2;

public class FlightsParser {
    public static int ORIGIN_AIRPORT_INDEX = 11;
    public static int DEST_AIRPORT_INDEX = 14;
    public static int DELAYTIME_INDEX = 18;
    public static int CANCELLED_INDEX = 19;
    public static String SEPARATOR = ",";
    public static String FLIGHTS_HEADER_SUBSTR = "YEAR";

    public static Tuple2<Tuple2<Integer, Integer>, Flight> parseFlightsFile(String row) {
        String[] params = row.split(SEPARATOR);
        int originAirportID = Integer.parseInt(params[ORIGIN_AIRPORT_INDEX]);
        int destAirportID = Integer.parseInt(params[DEST_AIRPORT_INDEX]);
        float delay = params[DELAYTIME_INDEX].isEmpty()? 0.f : Float.parseFloat(params[DELAYTIME_INDEX]);
        float isCanceled = Float.parseFloat(params[CANCELLED_INDEX]);
        return new Tuple2<>(new Tuple2<>(originAirportID, destAirportID), new Flight(originAirportID, destAirportID, delay, isCanceled));
    }

    public static boolean isNotFlightsHeader(String row){
        return !row.contains(FLIGHTS_HEADER_SUBSTR);
    }
}
