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
        JavaPairRDD<Tuple2<Integer, Integer>, Flight> flights = rows.filter(FlightsParser::isNotFlightsHeader) // удаление хедера полетов
                .mapToPair(FlightsParser::parseFlightsFile);
        flights.saveAsTextFile("hdfs://localhost:9000/user/sava/output_3");
    }
}
/* gitwatch -r https://login:G8g3nsb1a@https://github.com/savin-aleksej-andreevich/AirportsApp2.git  */
// hadoop fs -copyFromLocal 664600583_T_ONTIME_sample.csv
// hadoop fs -copyFromLocal L_AIRPORT_ID.csv
// spark-submit --class ru.bmstu.AiportsApp2  --master yarn-client --num-executors 3  target/spark-examples-1.0-SNAPSHOT.jar
// hadoop fs -copyToLocal output_3
