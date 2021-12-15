package ru.bmstu;

public class AirportsParser {
    public static boolean isNotAirportsHeader(String row){
        return !row.contains(FLIGHTS_HEADER_SUBSTR);
    }
}
