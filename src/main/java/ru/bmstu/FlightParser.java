package ru.bmstu;

import scala.Tuple2;

public class FlightParser {
    public static int DEST_AIRPORT_INDEX = 14;
    public static int ORIGIN_AIRPORT_INDEX = 11;
    public static int DELAYTIME_INDEX = 18;
    public static int CANCELLED_INDEX = 19;
    public static String FLIGHT_DELIMETR = ",";
    public static String FLIGHTS_HEADER_SUBSTR = "YEAR";

    public static Tuple2<Tuple2<Integer, Integer>, Flight> parseFlightsFile(String row) {
        int delay = row[]
    }

    public static boolean isNotFlightsHeader(String row){
        return !row.contains(FLIGHTS_HEADER_SUBSTR);
    }
}
