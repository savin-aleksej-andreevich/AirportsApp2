package ru.bmstu;

import scala.Tuple2;

public class AirportsParser {
    public static String AIRPORT_ROW_SEPARATOR = "\",\"";
    public static String AIRPORT_SEPARATOR = "\"";
    public static int AIRPORT_ID_INDEX = 0;
    public static int AIRPORT_NAME_INDEX = 1;
    public static String AIRPORT_HEADER_SUBSTR = "Code";
    public static int AIRPORT_NAME_WITHOUT_QUITE_INDEX = 0;
    public static int AIRPORT_ID_WITHOUT_QUITE_INDEX = 1;

    public static boolean isNotAirportsHeader(String row){
        return !row.contains(AIRPORT_HEADER_SUBSTR);
    }

    public static Tuple2<Integer, String> parseAiportFile(String row){
        String[] params = row.split(AIRPORT_ROW_SEPARATOR);
        int airportId = Integer.parseInt(params[AIRPORT_ID_INDEX].split(AIRPORT_SEPARATOR)[AIRPORT_ID_WITHOUT_QUITE_INDEX]);
        String airportName = params[AIRPORT_NAME_INDEX].split(AIRPORT_SEPARATOR)[AIRPORT_NAME_WITHOUT_QUITE_INDEX];
        return new Tuple2<>(airportId, airportName);
    }
}
