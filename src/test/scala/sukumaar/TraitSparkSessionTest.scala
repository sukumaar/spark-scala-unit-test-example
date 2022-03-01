package sukumaar

import org.apache.spark.sql.SparkSession

/** This trait is suppose to be used as mixin. To add spark session in all the
  * test classes which has spark test cases
  */
trait TraitSparkSessionTest {

  protected val sparkSession = SparkSession
    .builder()
    .appName("sample-spark-scala-project")
    .master("local[2]")
    .getOrCreate()
       
}
