package com.spark_scala

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.sql.SparkSession

object HelloSpark extends App {
  
val spark = new SparkSession.Builder().appName("Sample Spark Program").master("local").getOrCreate()
  println("Hello Mr.Bhanu Prakash, Welcome to Spark Scala programming")
}