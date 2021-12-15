package ru.bmstu;

public class AirportsParser {
    public static String AIRPORT_ROW_DELIMETR = "\",\"";
    public static String AIRPORT_DELIMETR = "\"";
    public static int AIRPORT_ID_INDEX = 0;
    public static int AIRPORT_NAME_INDEX = 1;
    public static String AIRPORT_HEADER_SUBSTR = "Code";
    public static int AIRPORT_NAME_WITHOUT_QUITE_INDEX = 0;
    public static int AIRPORT_ID_WITHOUT_QUITE_INDEX = 1;

    public static boolean isNotAirportsHeader(String row){
        return !row.contains(AIRPORT_HEADER_SUBSTR);
    }
}
