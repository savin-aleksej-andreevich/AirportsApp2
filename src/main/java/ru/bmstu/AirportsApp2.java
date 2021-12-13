package ru.bmstu;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import scala.Tuple2;


public class AirportsApp2 {
    public static String outputPath = "hdfs://localhost:9000/user/sava/output_3";

    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setAppName("AirportsApp2");
        JavaSparkContext sc = new JavaSparkContext(conf);
        JavaRDD<String> rows = sc.textFile("664600583_T_ONTIME_sample.csv");
        JavaPairRDD<Tuple2<Integer, Integer>, Flights> flights = rows.filter(FlightsParser::isNotFlightsHeader)
                .mapToPair(FlightsParser::parseFlightsFile);
        JavaPairRDD<Tuple2<Integer, Integer>, Flights> flightStats = flights.
    }
}
