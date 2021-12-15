package ru.bmstu;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import scala.Tuple2;
/*
Требуется определить для пары <аэропорт отлета, аэропорт прибытия> максимальное время опоздания, процент опоздавших+отмененных рейсов.
Также требуется связать полученную таблицу с названиями аэропортов.
 */

public class AirportsApp2 {
    public static String outputPath = "hdfs://localhost:9000/user/sava/output_3";

    public static void main(String[] args) {
        SparkConf conf = new SparkConf().setAppName("AirportsApp2");
        JavaSparkContext sc = new JavaSparkContext(conf);

        JavaRDD<String> rows = sc.textFile("664600583_T_ONTIME_sample.csv");
        JavaPairRDD<Tuple2<Integer, Integer>, Flight> flights = rows.filter(FlightsParser::isNotFlightsHeader) // удаление хедера полетов
                .mapToPair(FlightsParser::parseFlightsFile);
        JavaPairRDD<Tuple2<Integer, Integer>, FlightStats> flightsStats = flights.combineByKey (
                FlightStats::createFlightsStats,
                FlightStats::addFlight,
                FlightStats::combineFlightStats
        );

        JavaRDD<String> airportsFile = sc.textFile("L_AIRPORT_ID.csv_");
    

    }
}
/* gitwatch -r https://login:G8g3nsb1a@https://github.com/savin-aleksej-andreevich/AirportsApp2.git  */
// hadoop fs -copyFromLocal 664600583_T_ONTIME_sample.csv
// hadoop fs -copyFromLocal L_AIRPORT_ID.csv
// spark-submit --class ru.bmstu.AiportsApp2  --master yarn-client --num-executors 3  target/spark-examples-1.0-SNAPSHOT.jar
// hadoop fs -copyToLocal output_3
