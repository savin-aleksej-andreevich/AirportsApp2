package ru.bmstu;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.broadcast.Broadcast;
import scala.Tuple2;
import java.util.Map;


public class AirportsApp2 {
    public static String outputPath = "hdfs://localhost:9000/user/sava/output_3";

    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setAppName("lab5");
        JavaSparkContext sc = new JavaSparkContext(conf);
        JavaRDD<String> rows = sc.textFile("664600583_T_ONTIME_sample.csv");
        JavaPairRDD<Tuple2<Integer, Integer>, Flight> flights = rows.filter(FlightParser::isNotFlightsHeader)
                .mapToPair(FlightParser::parseFlightsFile);
    }
}
